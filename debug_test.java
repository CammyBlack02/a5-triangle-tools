import triangle.syntacticAnalyzer.Scanner;
import triangle.syntacticAnalyzer.SourceFile;
// import triangle.syntacticAnalyzer.Token;
import triangle.ErrorReporter;
import triangle.syntacticAnalyzer.Parser;

public class debug_test {
    public static void main(String[] args) {
        try {
            SourceFile source = SourceFile.fromResource("/hi-newcomment.tri");
            Scanner scanner = new Scanner(source);
            ErrorReporter reporter = new ErrorReporter(true);
            Parser parser = new Parser(scanner, reporter);
            
            System.out.println("About to parse...");
            parser.parseProgram();
            System.out.println("Parsing completed successfully!");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
