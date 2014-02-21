grammar TTL_;
import SPARQLexer; 

@header {
/** The TTL_Parser takes care of parsing TTL files that hold the RDF input data. */
}
options {
  language = Java;
}

// TTL FILE ...

// trivial grammar ...
prog:	expr NEWLINE EOF;
expr:	LITERAL_INT ;