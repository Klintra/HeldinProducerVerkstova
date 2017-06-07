# Dømi um vevtænastu-veitara til  Heldina

Kodan í hesum Java-dømi er skriva til

* Java 1.8
* Eclipse Luna 
* Tomcat 7
* Apache CXF 3.1.11

Kodan er generera ut frá WSDL-fíluni við hesi Apache CXF kommando:

    apache-cxf-3.1.11\bin\wsdl2java.bat -d src -p http://kli-util-v1.x-road.ee/producer=ee.x_road.kli_util_v1.producer -impl -validate -exsh true -dns true -dex true -autoNameResolution -verbose -defaultValues -fe jaxws21 -db jaxb -wv 1.1 WebContent\wsdl\Verkstova.wsdl
