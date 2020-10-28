package test;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFaDocumentFormat;
import org.semanticweb.owlapi.model.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
//            SAXParserFactory factory = SAXParserFactory.newInstance();
//            factory.setValidating(false);
//            SAXParser saxParser = factory.newSAXParser();
//            File file = new File("/Users/kec/solor-source-artifact-transformer/solor-terminology-sources/RxNorm-defined-with-SNCT-classes-20190719.owl");
//            saxParser.parse(file, new RxNormHandler());


            OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
            OWLOntology ontology = manager.loadOntology(IRI.create(new File("/Users/kec/solor-source-artifact-transformer/solor-terminology-sources/RxNorm-defined-with-SNCT-classes-20190719.owl")));


            // Annotation properties
            // Object properties
            //ontology.

            // Classes

//            ontology.classesInSignature().forEach(owlClass -> {
//                ClassExpressionType expressionType = owlClass.getClassExpressionType();
//                //owlClass.
//            });

            // rdf:Description -- Annotations
//            ontology.annotations().forEach(owlAnnotation -> {
//                OWLAnnotationValue value = owlAnnotation.annotationValue();
//            });

            ontology.saveOntology(new RDFXMLDocumentFormat(), System.out);

            //             RDFXMLRenderer renderer = new RDFXMLRenderer(ontology, writer, format);
            //RDFGraph.startDocument(IRI rootElement)
            System.out.println( "\nHello World!" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
