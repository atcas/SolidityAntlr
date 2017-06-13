package com.djaramillo.ant.solidity;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;

import com.atcas.grammar.antrl.solidity.UnderlineListener;
import com.atcas.grammar.antrl.solidity.base.SolidityLexer;
import com.atcas.grammar.antrl.solidity.base.SolidityParser;





public class GrammarTest {
	
	
	  private String getFile(String fileName){
		  String result = "";

		  ClassLoader classLoader = getClass().getClassLoader();
		  try {
			result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
		  } catch (IOException e) {
			e.printStackTrace();
		  }

		  return result;

	  }
	
	
	
	
	
	    @Test
	    public void testComentsGrammar()  {

		 	String result = getFile("comments.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }

	    
	    @Test
	    public void testIntegerLiteralsGrammar()  {

		 	String result = getFile("IntegerLiterals.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void testContractsInheritGrammar()  {

		 	String result = getFile("ContractsInherit.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void testGasforFunctionGrammar()  {

		 	String result = getFile("GasforFunction.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    

	    @Test
	    public void testDeleteStructsGrammar()  {

		 	String result = getFile("DeleteStructs.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void testContractInheritanceGrammar()  {

		 	String result = getFile("ContractInheritance.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	    public void testFunctionModifiersGrammar()  {

		 	String result = getFile("FunctionModifiers.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    

	    @Test
	    public void testHashTypesGrammar()  {

		 	String result = getFile("HashTypes.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	    public void testAccessSuper1Grammar()  {

		 	String result = getFile("AccessSuper1.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    

	    @Test
	    public void testAccessSuper2Grammar()  {

		 	String result = getFile("AccessSuper2.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    @Test
	    public void testStateVariableAccessors1Grammar()  {

		 	String result = getFile("StateVariableAccessors1.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    /*
	     no support soliditi 0.4
	    @Test
	    public void testStateVariableAccessors1Grammar()  {

		 	String result = getFile("StateVariableAccessors2.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    */
	    
	    @Test
	     public void testStateVariableEventsGrammar()  {

		 	String result = getFile("Events.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    @Test
	     public void testFallBackGrammar()  {

		 	String result = getFile("Fallback.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    @Test
	     public void testVisibilitySpecifiers1Grammar()  {

		 	String result = getFile("VisibilitySpecifiers.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	   
	    @Test
	     public void testVisibilitySpecifiers2Grammar()  {

		 	String result = getFile("VisibilitySpecifiers2.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	   
	    @Test
	     public void testArrayVisibilitySpecifiers3Grammar()  {

		 	String result = getFile("ArrayVisibilitySpecifiers3.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void testSHA3Grammar()  {

		 	String result = getFile("SHA3.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void testEtherSubdenominationsGrammar()  {

		 	String result = getFile("EtherSubdenominations.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    

	
	    @Test
	     public void testOptionalParameterNamesGrammar()  {

		 	String result = getFile("OptionalParameterNames.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }

	    
	    @Test
	     public void testGenericCallMethodGrammar()  {

		 	String result = getFile("GenericCallMethod.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	     public void ByteArraysGrammar()  {

		 	String result = getFile("ByteArrays.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    

	    @Test
	     public void EnumsGrammar()  {

		 	String result = getFile("Enums.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    @Test
	     public void VisibilitySpecifiers3Grammar()  {

		 	String result = getFile("VisibilitySpecifiers3.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void ImportStatementGrammar()  {

		 	String result = getFile("ImportStatement.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void InlineMembersInitializationGrammar()  {

		 	String result = getFile("InlineMembersInitialization.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    @Test
	     public void ArgumentsConstructorBaseContractGrammar()  {

		 	String result = getFile("ArgumentsConstructorBaseContract.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    
	    @Test
	     public void DetectFailedCALLsGrammar()  {

		 	String result = getFile("DetectFailedCALLs.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    @Test
	     public void BasicFeaturesArraysGrammar()  {

		 	String result = getFile("BasicFeaturesArrays.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    @Test
	     public void TimedContractGrammar()  {

		 	String result = getFile("TimedContract.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }	
	    
	    
	    
	    
	    
	    
	    @Test
	     public void MsgSigGrammar()  {

		 	String result = getFile("MsgSig.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    @Test
	     public void TightlypackedStorageGrammar()  {

		 	String result = getFile("TightlypackedStorage.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    @Test
	     public void CommonSubexpressionMemoryGrammar()  {

		 	String result = getFile("CommonSubexpressionMemory.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	     public void CommonSubexpressionEliminationGrammar()  {

		 	String result = getFile("CommonSubexpressionElimination.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	     public void ExternalTypesGrammar()  {

		 	String result = getFile("ExternalTypes.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    @Test
	     public void AccessorForArraysGrammar()  {

		 	String result = getFile("AccessorForArrays.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    @Test
	     public void OverloadingFunctionsGrammar()  {

		 	String result = getFile("OverloadingFunctions.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    @Test
	     public void MergingBasicBlocksGrammar()  {

		 	String result = getFile("MergingBasicBlocks.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    
	    
	    
	    @Test
	     public void InterfaceContractsGrammar()  {

		 	String result = getFile("InterfaceContracts.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	     public void BareCallcodeGrammar()  {

		 	String result = getFile("BareCallcode.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void InMemoryTypesGrammar()  {

		 	String result = getFile("InMemoryTypes.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    
	    @Test
	     public void BinarySearchGrammar()  {

		 	String result = getFile("BinarySearch.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	     public void StructsinMemoryGrammar()  {

		 	String result = getFile("StructsinMemory.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	
	    
	    @Test
	     public void FlexibleStringLiteralsGrammar()  {

		 	String result = getFile("FlexibleStringLiterals.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    @Test
	     public void StringsMappingKeysGrammar()  {

		 	String result = getFile("StringsMappingKeys.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    @Test
	     public void LibrariesGrammar()  {

		 	String result = getFile("Libraries.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    @Test
	     public void ThrowGrammar()  {

		 	String result = getFile("Throw.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    
	    
	    @Test
	     public void InternalTypesLibrariesGrammar()  {

		 	String result = getFile("InternalTypesLibraries.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    
	    
	    @Test
	     public void PreexistingGrammar()  {

		 	String result = getFile("Preexisting.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }   
	    
	    
	    @Test
	     public void PushGrammar()  {

		 	String result = getFile("Push.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    } 
	    
	    
	    @Test
	     public void AllocationDynamicMemoryArraysGrammar()  {

		 	String result = getFile("AllocationDynamicMemoryArrays.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    @Test
	     public void AttachingLibraryFunctionsTypesGrammar()  {

		 	String result = getFile("AttachingLibraryFunctionsTypes.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    
	    
	    @Test
	     public void IndexAccessFixedGrammar()  {

		 	String result = getFile("IndexAccessFixed.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    @Ignore
	    @Test
	     public void InlineAssemblyGrammar()  {

		 	String result = getFile("InlineAssembly.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			SolidityLexer lexer = new SolidityLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			SolidityParser parser = new SolidityParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.program(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }    
	    
	    
	    
}
