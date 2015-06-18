package pack;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyfileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException arg1)
			throws IOException {
		System.out.println("just visited"+ dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes arg1)
			throws IOException {
		System.out.println("about to visit" + dir);
		return FileVisitResult.CONTINUE; 
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes arg1)
			throws IOException {
		if(arg1.isRegularFile()){ 
			System.out.print("Regular file : ");}
		System.out.println(file);
		return FileVisitResult.CONTINUE;
		
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc)
			throws IOException {
		                         System.err.println(exc.getMessage());
		                         return FileVisitResult.CONTINUE;
		                  }
	
}
