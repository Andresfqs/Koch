package centrosculturales;

import java.io.FileOutputStream;

public class ArchivoJson {
    private final static String jsonDocuent= "{\n" +
            "  \"meta\" : {\n" +
            "    \"view\" : {\n" +
            "      \"id\" : \"zzzz-zzzz\",\n" +
            "      \"name\" : \"Centros Culturales Ciudad de Bogotá\",\n" +
            "      \"attribution\" : \"SECRETARIA DE CULTURA, RECREACIÓN Y DEPORTE\",\n" +
            "      \"averageRating\" : 0,\n" +
            "      \"category\" : \"Cultura\",\n" +
            "      \"description\" : \"DataSet con los centros de documentacion, bibliotecas, hemerotecas identificadas en los equipamientos del sector Cultura Recreación y Deporte de la ciuad de bogtá actualizados durante el año 2014 y publicados en el año 2015\",\n" +
            "      \"displayType\" : \"table\",\n" +
            "      \"downloadCount\" : 0,\n" +
            "      \"hideFromCatalog\" : false,\n" +
            "      \"hideFromDataJson\" : false,\n" +
            "      \"indexUpdatedAt\" : 1481638041,\n" +
            "      \"licenseId\" : \"CC_40_BY_SA\",\n" +
            "      \"newBackend\" : false,\n" +
            "      \"numberOfComments\" : 0,\n" +
            "      \"oid\" : 0,\n" +
            "      \"provenance\" : \"community\",\n" +
            "      \"publicationAppendEnabled\" : false,\n" +
            "      \"publicationStage\" : \"published\",\n" +
            "      \"rowsUpdatedAt\" : 1468467866,\n" +
            "      \"rowsUpdatedBy\" : \"r4qn-dwdd\",\n" +
            "      \"tableId\" : 11903947,\n" +
            "      \"totalTimesRated\" : 0,\n" +
            "      \"viewCount\" : 0,\n" +
            "      \"viewType\" : \"tabular\",\n" +
            "      \"columns\" : [ {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"sid\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":sid\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"id\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":id\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"position\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":position\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"created_at\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":created_at\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"created_meta\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":created_meta\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"updated_at\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":updated_at\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"updated_meta\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":updated_meta\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : -1,\n" +
            "        \"name\" : \"meta\",\n" +
            "        \"dataTypeName\" : \"meta_data\",\n" +
            "        \"fieldName\" : \":meta\",\n" +
            "        \"position\" : 0,\n" +
            "        \"renderTypeName\" : \"meta_data\",\n" +
            "        \"format\" : { },\n" +
            "        \"flags\" : [ \"hidden\" ]\n" +
            "      }, {\n" +
            "        \"id\" : 262911468,\n" +
            "        \"name\" : \"no\",\n" +
            "        \"dataTypeName\" : \"number\",\n" +
            "        \"fieldName\" : \"no\",\n" +
            "        \"position\" : 1,\n" +
            "        \"renderTypeName\" : \"number\",\n" +
            "        \"tableColumnId\" : 37226016,\n" +
            "        \"width\" : 124,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911469,\n" +
            "        \"name\" : \"nombre_del_museo\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"nombre_del_museo\",\n" +
            "        \"position\" : 2,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226017,\n" +
            "        \"width\" : 292,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911470,\n" +
            "        \"name\" : \"telefono_fijo\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"telefono_fijo\",\n" +
            "        \"position\" : 3,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226018,\n" +
            "        \"width\" : 256,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911471,\n" +
            "        \"name\" : \"celular\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"celular\",\n" +
            "        \"position\" : 4,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226019,\n" +
            "        \"width\" : 184,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911472,\n" +
            "        \"name\" : \"correo_electrãnico\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"correo_electr_nico\",\n" +
            "        \"position\" : 5,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226020,\n" +
            "        \"width\" : 316,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911473,\n" +
            "        \"name\" : \"pagina_web\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"pagina_web\",\n" +
            "        \"position\" : 6,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226021,\n" +
            "        \"width\" : 220,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911474,\n" +
            "        \"name\" : \"direccion\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"direccion\",\n" +
            "        \"position\" : 7,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226022,\n" +
            "        \"width\" : 208,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911475,\n" +
            "        \"name\" : \"localidad\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"localidad\",\n" +
            "        \"position\" : 8,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226023,\n" +
            "        \"width\" : 208,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911476,\n" +
            "        \"name\" : \"upz\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"upz\",\n" +
            "        \"position\" : 9,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226024,\n" +
            "        \"width\" : 136,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911477,\n" +
            "        \"name\" : \"nombre_de_la_entidad_administradora_del_equipamiento\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"nombre_de_la_entidad_administradora_del_equipamiento\",\n" +
            "        \"position\" : 10,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226025,\n" +
            "        \"width\" : 700,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911478,\n" +
            "        \"name\" : \"ano_inicio\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"ano_inicio\",\n" +
            "        \"position\" : 11,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226026,\n" +
            "        \"width\" : 220,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911479,\n" +
            "        \"name\" : \"caracter\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"caracter\",\n" +
            "        \"position\" : 12,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226027,\n" +
            "        \"width\" : 196,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911480,\n" +
            "        \"name\" : \"del_orden\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"del_orden\",\n" +
            "        \"position\" : 13,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226028,\n" +
            "        \"width\" : 208,\n" +
            "        \"format\" : { }\n" +
            "      }, {\n" +
            "        \"id\" : 262911481,\n" +
            "        \"name\" : \"uso_principal\",\n" +
            "        \"dataTypeName\" : \"text\",\n" +
            "        \"fieldName\" : \"uso_principal\",\n" +
            "        \"position\" : 14,\n" +
            "        \"renderTypeName\" : \"text\",\n" +
            "        \"tableColumnId\" : 37226029,\n" +
            "        \"width\" : 256,\n" +
            "        \"format\" : { }\n" +
            "      } ],\n" +
            "      \"grants\" : [ {\n" +
            "        \"inherited\" : true,\n" +
            "        \"type\" : \"viewer\",\n" +
            "        \"flags\" : [ \"public\" ]\n" +
            "      } ],\n" +
            "      \"license\" : {\n" +
            "        \"name\" : \"Creative Commons Attribution | Share Alike 4.0 International\",\n" +
            "        \"logoUrl\" : \"images/licenses/cc30bysa.png\",\n" +
            "        \"termsLink\" : \"http://creativecommons.org/licenses/by-sa/4.0/legalcode\"\n" +
            "      },\n" +
            "      \"metadata\" : {\n" +
            "        \"jsonQuery\" : {\n" +
            "          \"order\" : [ {\n" +
            "            \"columnFieldName\" : \"localidad\",\n" +
            "            \"ascending\" : true\n" +
            "          } ]\n" +
            "        },\n" +
            "        \"custom_fields\" : {\n" +
            "          \"Información de la Entidad\" : {\n" +
            "            \"Municipio\" : \"Bogotá, d.c.\",\n" +
            "            \"Nombre de la Entidad\" : \"Secretaria de Cultura, Recreación y Deporte\",\n" +
            "            \"Orden\" : \"Territorial\",\n" +
            "            \"Sector\" : \"No Aplica\",\n" +
            "            \"Autor\" : \"SECRETARIA DE CULTURA, RECREACIÓN Y DEPORTE\",\n" +
            "            \"Departamento\" : \"Bogotá D.C\"\n" +
            "          },\n" +
            "          \"Información de Datos\" : {\n" +
            "            \"Cobertura Geográfica\" : \"Municipal\",\n" +
            "            \"Idioma\" : \"Español\",\n" +
            "            \"Frecuencia de Actualización\" : \"Anual\",\n" +
            "            \"Fecha Emisión (dd/mm/aaaa)\" : \"2015-09-17 00:00:00.0\",\n" +
            "            \"URL Documentación\" : \"http://siscred.scrd.gov.co/dataset/centros-cultura\",\n" +
            "            \"Fecha Emisión (aaaa-mm-dd)\" : \"2015-09-17\"\n" +
            "          }\n" +
            "        },\n" +
            "        \"availableDisplayTypes\" : [ \"table\", \"fatrow\", \"page\" ],\n" +
            "        \"renderTypeConfig\" : {\n" +
            "          \"visible\" : {\n" +
            "            \"table\" : true\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      \"query\" : {\n" +
            "        \"orderBys\" : [ {\n" +
            "          \"ascending\" : true,\n" +
            "          \"expression\" : {\n" +
            "            \"columnId\" : 262911475,\n" +
            "            \"type\" : \"column\"\n" +
            "          }\n" +
            "        } ]\n" +
            "      },\n" +
            "      \"rights\" : [ \"read\" ],\n" +
            "      \"tableAuthor\" : {\n" +
            "        \"id\" : \"q9ec-yhnj\",\n" +
            "        \"displayName\" : \"SECRETARIA DE CULTURA RECREACION Y DEPORTE\",\n" +
            "        \"roleName\" : \"editor\",\n" +
            "        \"screenName\" : \"SECRETARIA DE CULTURA RECREACION Y DEPORTE\",\n" +
            "        \"rights\" : [ \"create_datasets\", \"view_domain\", \"create_pages\", \"view_goals\", \"view_dashboards\", \"view_story\", \"view_unpublished_story\" ]\n" +
            "      },\n" +
            "      \"tags\" : [ \"centros culturales,cultua,arte\" ],\n" +
            "      \"flags\" : [ \"unsaved\" ]\n" +
            "    }\n" +
            "  },\n" +
            "  \"data\" : [ [ 1, \"2F733FF0-FD1E-4191-A43A-4AB780720BBA\", 1, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"ALIANZA COLOMBO FRANCESA SEDE CHICÓ\", \"3793370\", \"3164150676\", \"l.galli@alianzafrancesa.org.co\", \"http://www.alianzafrancesa.org.co/web/ciudad/bogota/inicio/principal\", \"AK 11 93 40\", \"CHAPINERO\", \"EL REFUGIO\", \"ALIANZA COLOMBO FRANCESA SEDE CHICO\", \"2011\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 2, \"3F9679E9-E108-45A9-939E-E87382B677A6\", 2, 1468442657, \"956448\", 1468442657, \"956448\", null, \"10\", \"CENTRO MUSICAL TEUSAQUILLO\", \"N.D\", \"N.D\", \"N.D\", \"http://www.fundacionbatuta.org/\", \"KR 27A 41 49\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"FUNDACIÓN NACIONAL BATUTA\", \"N.D\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 3, \"759A06A6-53FF-4EE3-80AF-423DDFCC997E\", 3, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"GOETHE-INSTITUT KOLUMBIEN\", \"6018600\", \"3123842999\", \"c.garcia@bogota.goethe.org\", \"http://www.goethe.de/ins/co/de/bog.html?wt_sc=bogota\", \"KR 11A 93 52\", \"CHAPINERO\", \"CHICO LAGO\", \"GOETHE-INSTITUT KOLUMBIEN\", \"1998\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 4, \"9FAE3958-BFCC-4379-A7C9-9B1315626C6B\", 4, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO MUSICAL LA GAITANA\", \"8976280\", \"N.D\", \"DEICYESPINOSA@FUNDACIONBATUTA.ORG\", \"http://www.fundacionbatuta.org/\", \"TV 126 133 32\", \"SUBA\", \"TIBABUYES\", \"FUNDACIÓN NACIONAL BATUTA\", \"1996\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 5, \"2B32EAC7-B2D5-4F0A-A596-35B979BC1259\", 5, 1468442657, \"956448\", 1468442657, \"956448\", null, \"13\", \"ASOCIACION CRISTIANA DE JOVENES\", \"2325269\", \"N.D\", \"gloriacifu@hotmail.com\", \"http://www.ymcabogota.org/ymca.htm\", \"KR 16 28B 33\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"ASOCIACIÓN CRISTIANA DE JOVENES\", \"1964\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 6, \"F2949394-879E-45B1-838B-1D928C4F07F9\", 6, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"ACADEMIA COLOMBIANA DE LA LENGUA\", \"3341190\", \"N.D\", \"secretaria.academialengua@yahoo.es\", \"http://www.academiacolombianadelalengua.co/\", \"AK 3 17 23\", \"SANTA FE\", \"LAS NIEVES\", \"ACADEMIA COLOMBIANA DE LA LENGUA - JAIME POZADA DIAZ\", \"1971\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 7, \"BC47CD56-5AD8-4293-A0F7-32506BEBFA40\", 7, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO DE DESARROLLO COMUNITARIO LA GIRALDA\", \"4181949 EXT 105-11\", \"N.D\", \"LPOLANIA@INTEGRACIONSOCIAL.GOV.CO\", \"http://www.integracionsocial.gov.co/\", \"KR 104B 22J 15\", \"FONTIBÓN\", \"FONTIBON\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"2010\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 8, \"0D862518-888E-4F8B-8E35-5F369276FBBC\", 8, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO DE EXPRESIÓN CULTURAL FE Y ALEGRIA\", \"7610679 - 2001102\", \"N.D\", \"N.D\", \"http://www.feyalegria.org/es\", \"KR 1 ESTE 75 26 SUR\", \"USME\", \"GRAN YOMASA\", \"FE Y ALEGRÍA DE COLOMBIA\", \"1987\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 9, \"EFAE497C-BE61-444B-BCB2-616D8578BD57\", 9, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN RAFAEL URIBE URIBE SAN JOSÉ\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 12D 22 80 sur\", \"RAFAEL URIBE URIBE\", \"SAN JOSE\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 10, \"83E1D755-ACE1-4D78-A0AF-64D6882440FA\", 10, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"CADE PATIO BONITO\", \"2656003\", \"3112799569\", \"PARAISOCOLOMBIA@YAHOO.COM\", \"N.D\", \"KR 87 5B 21 SUR\", \"KENNEDY\", \"PATIO BONITO\", \"PARAÍSO COLOMBIA - PUNTOS CARDINALES\", \"1986\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 11, \"87ABBFAD-1AA7-4335-A572-2368A0415CFD\", 11, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"PARQUE ZONAL LA AMISTAD\", \"2645100\", \"N.D\", \"eligio.plazas@idrd.gov.co\", \"http://www.idrd.gov.co/sitio/idrd/\", \"KR 78J 41 10 SUR\", \"KENNEDY\", \"KENNEDY CENTRAL\", \"INSTITUTO DISTRITAL DE RECREACIÓN Y DEPORTE -IDRD\", \"1975\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 12, \"7F840D92-32FA-44D7-ADBB-BA63C84B5003\", 12, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN SUBA CENTRO\", \"6817755\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"Cl 146B 91 44\", \"SUBA\", \"SUBA\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 13, \"AFC9ED12-63A1-4F3D-BA86-07432499DDE3\", 13, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CLAN BARRIOS UNIDOS POLO\", \"6347325\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 22 84 50\", \"BARRIOS UNIDOS\", \"LOS ALCAZARES\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 14, \"D09C6685-1038-4787-9B46-05E5D7B8863F\", 14, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO DE DESAROLLO COMUNITARIO EL PORVENIR\", \"7383883\", \"N.D\", \"MAGUDELO@ESDIS.GOV.CO\", \"http://www.integracionsocial.gov.co/\", \"KR 100 52 24 SUR\", \"BOSA\", \"EL PORVENIR\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"2011\", \"PÚBLICO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 15, \"F8E71D2D-D250-4060-B45B-073CFF15DCE0\", 15, 1468442657, \"956448\", 1468442657, \"956448\", null, \"11\", \"CENTRO CULTURAL ISLÁMICO\", \"3350366\", \"N.D\", \"N.D\", \"N.D\", \"CL 36 28B 10\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"CENTRO CULTURAL ISLÁMICO\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 16, \"F3343BF5-FAF0-4DBD-BC70-C56A7D9B00E3\", 16, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"FUNDACIÓN CASA DE POESÍA  SILVA\", \"2865710\", \"N.D\", \"casadepoesiasilva@casadepoesiasilva.com\", \"http://casadepoesiasilva.com/\", \"CL 12C 3 41\", \"CANDELARIA\", \"LA CANDELARIA\", \"FUNDACIÓN CASA DE POESÍA SILVA\", \"1987\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 17, \"A991E650-0175-4655-82F5-0C1B1AFD4D1C\", 17, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO CULTURAL SKANDIA\", \"6584000\", \"N.D\", \"centrocultural@oldmutual.com.co?\", \"https://www.oldmutual.com.co/centro-cultural/Paginas/default.aspx\", \"AK 19 109A 30\", \"USAQUÉN\", \"SANTA BARBARA\", \"CENTRO CULTURAL SKANDIA\", \"N.D\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 18, \"627BC696-C5D6-4261-8315-D6AF2D2764A9\", 18, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO CULTURAL GABRIEL GARCÍA MÁRQUEZ\", \"2832200\", \"3103814985\", \"coordiandorsulturalyacademico@fce.com.co\", \"http://www.fce.com.co/CCGGM\", \"CL 11 5 60\", \"CANDELARIA\", \"LA CANDELARIA\", \"FONDO DE CULTURA ECONÓMICA\", \"2008\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 19, \"8A892B9E-F875-4D49-9492-343CFCF35053\", 19, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CORPORACIÓN CENTRO LOCAL DE DESARROLLO INTEGRAL DE JERUSALEN (CELODIJE)\", \"7172890\", \"3102206969\", \"CELODIJE.CORPORACIÓN@GMAIL.COM\", \"N.D\", \"KR 46C 70 59 SUR\", \"CIUDAD BOLÍVAR\", \"JERUSALEM\", \"CORPORACIÓN CENTRO LOCAL DE DESARROLLO INTEGRAL DE JERUSALEN (CELODIJE)\", \"1989\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 20, \"0C03E39A-8087-447B-A55B-5DFA6AF1D25E\", 20, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"FUNDACIÓN CULTURAL CHIMINIGAGUA\", \"7803879\", \"N.D\", \"coddiarcupop@gmail.com\", \"N.D\", \"KR 80K 72 45 SUR\", \"BOSA\", \"BOSA CENTRAL\", \"COORPORACION CODDIARCUPOP\", \"1993\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 21, \"947C7FB5-7510-4F3B-BE2F-8CBF9BA71775\", 21, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"CLAN SUBA VILLA MARIA\", \"6936941\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 139 110 05\", \"SUBA\", \"EL RINCON\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 22, \"354785F7-BF76-443B-90BE-D7BED6379862\", 22, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"COORPORACIÓN CECUDEC (CENTRO CULTURAL DE DESARROLLO COMUNITARIO) Y BIBLIOTECA COMUNITARIA INSTITUTO CERROS DEL SUR\", \"7172495 - 7184181\", \"3012322277 - 3142990605\", \"colegioices@gmail.com\", \"N.D\", \"CL 81 SUR 42 09\", \"CIUDAD BOLÍVAR\", \"JERUSALEM\", \"CORPORACIÓN CENTRO CULTURAL DE DESARROLLO COMUNITARIO EVARISTO BERNATE\", \"1984\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 23, \"7D1D31F7-975A-4792-98AC-0B88327CE536\", 23, 1468442657, \"956448\", 1468442657, \"956448\", null, \"7\", \"CLAN CIUDAD BOLÍVAR LUCERO BAJO\", \"7924708\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 17D BIS 64A 54 SUR\", \"CIUDAD BOLÍVAR\", \"LUCERO\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 24, \"2B90DE30-6A6D-41AB-A516-8D9E88F8FD82\", 24, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"SALA OTTO DE GREIF\", \"2883466 EXT 123\", \"N.D\", \"rrmero@ofb.gov.co\", \"http://www.filarmonicabogota.gov.co/newsite/\", \"CL 39 BIS 14 32\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"ORQUESTA FILARMÓNICA DE BOGOTÁ\", \"2000\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 25, \"DD41C666-71AD-48C6-B900-A564D414D31A\", 25, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CASA DE LA CULTURA ASOJUVENIL\", \"7170786\", \"3112156284\", \"ASOJUVENIL@YAHOO.COM\", \"N.D\", \"CL 66 SUR 18U 19\", \"CIUDAD BOLÍVAR\", \"LUCERO\", \"ASOCIACIÓN JUVENTUDES COMPARTIR ASOJUVENIL\", \"2001\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 26, \"7CB3BBC9-0BB8-434C-97EE-227052CA5D37\", 26, 1468442657, \"956448\", 1468442657, \"956448\", null, \"10\", \"CENTRO DE DESARROLLO COMUNITARIO BELLAVISTA\", \"4528233 EXT 103\", \"N.D\", \"BELLAVISTACDC@GMAIL.COM\", \"http://www.integracionsocial.gov.co/\", \"CL 38 SUR 94C 29\", \"KENNEDY\", \"PATIO BONITO\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"2000\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 27, \"DBB8785F-BB97-49B1-BCD4-212988D39A60\", 27, 1468442657, \"956448\", 1468442657, \"956448\", null, \"7\", \"CASA DEL TOLIMA\", \"2882349\", \"N.D\", \"patarroyo04@hotmail.com\", \"N.D\", \"CL 34 5 81\", \"SANTA FE\", \"SAGRADO CORAZON\", \"CASA DEL TOLIMA\", \"N.D\", \"PÚBLICO\", \"DEPARTAMENTAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 28, \"52E992E3-B9B0-4DB1-A1D5-2C4F62200F9D\", 28, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"FUNDACIÓN CULTURAL EL CONTRABAJO\", \"8210901- 7280256\", \"3123476644\", \"felcontrabajo@yahoo.com\", \"http://fundacionelcontrabajo.blogspot.com/\", \"KR 61 62 05 SUR\", \"CIUDAD BOLÍVAR\", \"ARBORIZADORA\", \"FUNDACIÓN CULTURAL  EL CONTRABAJO\", \"1996\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 29, \"9C23EE5D-44BB-4319-BAC7-D38910C5A6B5\", 29, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"FUNDACIÓN SEMILLITO\", \"2820688\", \"3118372637\", \"fundacionsemillito@gmail.com \", \"http://semillito.blogspot.com/\", \"CL 87 SUR 17 A 21 ESTE\", \"USME\", \"LA FLORA\", \"FUNDACIÓN SEMILLITO\", \"2003\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 30, \"193BF463-22FD-462D-A1D7-F8C340F09E21\", 30, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN USME CANTARANA\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 1A BIS 100 45 SUR\", \"USME\", \"COMUNEROS\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 31, \"C6CA388F-3415-449E-9339-2DD3DDBBB59F\", 31, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CLAN BARRIOS UNIDOS SANTA SOFIA\", \"2252057\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 28 77 70\", \"BARRIOS UNIDOS\", \"LOS ALCAZARES\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 32, \"0F553C0C-72D5-4CDF-9AF6-9B0F4DAC51E8\", 32, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CORPORACIÓN CENTRO DE PROMOCION Y CULTURA BRITALIA\", \"450 88 87\", \"3133161009 - 3212345812\", \"centrodepromocionyculturaijbogota@gmail.com\", \"N.D\", \"KR 80I 52A 08 SUR\", \"KENNEDY\", \"GRAN BRITALIA\", \"CORPORACION CENTRO DE PROMOCION Y CULTURA BRITALIA\", \"1978\", \"MIXTO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 33, \"E6CEC239-A36B-4E92-97F0-8E24800893B9\", 33, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CLAN RAFAEL URIBE URIBE\", \"3795750 EXT 426 - 427\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 27A 15 51 SUR\", \"RAFAEL URIBE URIBE\", \"SAN JOSE\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 34, \"097E800F-70B2-40A0-8406-D329EAC240F4\", 34, 1468442657, \"956448\", 1468442657, \"956448\", null, \"10\", \"MUSEO TAURINO - PLAZA DE TOROS LA SANTAMARÍA\", \"2822792\", \"N.D\", \"ernestoabellovillalba@yahoo.com\", \"http://www.idrd.gov.co/sitio/idrd/\", \"KR 6 26B 50\", \"SANTA FE\", \"SAGRADO CORAZON\", \"INSTITUTO DISTRITAL DE RECREACIÓN Y DEPORTE -IDRD\", \"1969\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 35, \"D270D339-B556-48B7-821B-662CDB8179DD\", 35, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"ASOCIACIÓN CULTURAL MURO DE ESPUMA\", \"6721110\", \"N.D\", \"N.D\", \"N.D\", \"KR 16A 155A 32\", \"USAQUÉN\", \"SAN CRISTOBAL NORTE\", \"ASOCIACIÓN CULTURAL MURO DE ESPUMA\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 36, \"B51619B8-D89A-448F-BD31-7C04933FA2C6\", 36, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"UNIVERSIDAD DE CIENCIAS APLICADAS Y AMBIENTALES UDCA\", \"6761037\", \"3106804363\", \"JBENAVID@UDCA.EDU.CO\", \"http://www.udca.edu.co/\", \"CL 222 55 37\", \"SUBA\", \"LA ACADEMIA\", \"UNIVERSIDAD DE CIENCIAS APLICADAS Y AMBIENTALES UDCA\", \"N.D\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 37, \"9AD65A8C-0140-41C5-959C-807E59D8C089\", 37, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CLAN USME LA LIRA\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"AK 14 117 65 SUR\", \"USME\", \"COMUNEROS\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 38, \"E27754DB-E4E0-4605-9012-4E8398BBE9AD\", 38, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CENTRO CULTURAL MAGITINTO\", \"N.D\", \"N.D\", \"N.D\", \"N.D\", \"KR 6 117 12\", \"CHAPINERO\", \"CHICO LAGO\", \"CENTRO CULTURAL MAGITINTO\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 39, \"1B31B60B-56EC-42CD-A29A-B144FC38F36B\", 39, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CENTRO MUSICAL JERUSALEM\", \"8106098\", \"3115646521\", \"leninsilva@fundacionbatuta.org\", \"http://www.fundacionbatuta.org/\", \"KR 42 73A 10 SUR\", \"CIUDAD BOLÍVAR\", \"JERUSALEM\", \"FUNDACIÓN NACIONAL BATUTA\", \"1994\", \"PÚBLICO\", \"NACIONAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 40, \"9E2182AF-937C-49CC-B2FD-FD7EB548DFFB\", 40, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CLAN ENGATIVÁ LAS FERIAS\", \"2402433\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 68G 78 95\", \"ENGATIVÁ\", \"LAS FERIAS\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 41, \"9DC782AB-55EE-4CF6-90ED-D2B7D5EA3660\", 41, 1468442657, \"956448\", 1468442657, \"956448\", null, \"8\", \"CLAN CIUDAD BOLÍVAR MEISSEN\", \"7925024\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 63 17A 38 SUR\", \"CIUDAD BOLÍVAR\", \"LUCERO\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 42, \"F8259379-39D0-4059-8D0B-2E8FE253217F\", 42, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"ALIANZA COLOMBO FRANCESA\", \"3411348\", \"N.D\", \"N.D\", \"http://www.alianzafrancesa.org.co/web/ciudad/bogota/inicio/principal\", \"KR 3 18 45\", \"SANTA FE\", \"LAS NIEVES\", \"ALIANZA COLOMBO FRANCESA\", \"N.D\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 43, \"65BB5457-4DA4-4462-A959-68D5069C510A\", 43, 1468442657, \"956448\", 1468442657, \"956448\", null, \"8\", \"SPRACH INSTITUT\", \"2884906\", \"N.D\", \"info@sprachintitut-icca.com\", \"http://www.sprachinstitut-icca.com/\", \"KR 7 42 11\", \"CHAPINERO\", \"CHAPINERO\", \"SPRACH INSTITUT\", \"2003\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 44, \"0B4247AF-8A7B-4BD0-B283-39F97F8B8AE1\", 44, 1468442657, \"956448\", 1468442657, \"956448\", null, \"9\", \"CENTRO CULTURAL LLANERO\", \"2354907\", \"3203446942\", \"centroculturallanero.hotmail.com\", \"http://www.centroculturallanero.org.co/\", \"CL 62 20 28\", \"TEUSAQUILLO\", \"GALERIAS\", \"ASOCIACIÓN FOLCLORICA CENTRO CULTURAL LLANERO\", \"1991\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 45, \"EC00B13C-E76D-4578-A1C6-A6B5D3C4FF99\", 45, 1468442657, \"956448\", 1468442657, \"956448\", null, \"8\", \"CENTRO DE DESARROLLO COMUNITARIO KENNEDY\", \"2658252\", \"3156936431\", \"SANDRA.BENAV@HOTMAIL.COM\", \"http://www.integracionsocial.gov.co/\", \"AC 43 SUR 80 B 33\", \"KENNEDY\", \"GRAN BRITALIA\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"1980\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 46, \"75C1A63C-4C1D-4511-A501-CCD2E5A995DB\", 46, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CENTRO DE DESARROLLO COMUNITARIO COLINAS\", \"3611410 - 3665335\", \"311444143\", \"gmorenoss@hotmail.com\", \"http://www.integracionsocial.gov.co/\", \"KR 15C 31G 40 SUR\", \"RAFAEL URIBE URIBE\", \"SAN JOSE\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"N.D\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 47, \"4830AE0F-7882-43AE-AAF7-2E90835F3E8A\", 47, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CENTRO MUSICAL KENNEDY\", \"4521672\", \"3134507540\", \"CESARDONCEL@FUNDACIONBATUTA.ORG\", \"http://www.fundacionbatuta.org/\", \"KR 72C BIS 06 08 SUR\", \"KENNEDY\", \"AMERICAS\", \"FUNDACIÓN NACIONAL BATUTA\", \"1999\", \"MIXTO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 48, \"4280120D-FF67-44EE-86E4-0DA4BD5C2EF3\", 48, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO CULTURAL NARIÑO 2\", \"3661085\", \"3107681946\", \"MUSEO40@HOTMAIL.COM\", \"N.D\", \"KR 24G 20 60 SUR\", \"ANTONIO NARIÑO\", \"RESTREPO\", \"FUNDACIÓN MUSEOS DEL CUERO Y DE LOS AÑOS 40\", \"2003\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 49, \"DE964EFC-DE10-42DC-8AEB-A6E06E4DDF9C\", 49, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CLAN ENGATIVÁ VILLAS DEL DORADO\", \"4310935\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 107 70 BIS 58\", \"ENGATIVÁ\", \"GARCES NAVAS\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 50, \"9A16F77D-1C74-419E-A285-E7A7F7B2D790\", 50, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CORPORACIÓN CASA DE LA JUVENTUD DE KENNEDY\", \"N.D\", \"N.D\", \"N.D\", \"N.D\", \"CL 40A 74 34 SUR\", \"KENNEDY\", \"KENNEDY CENTRAL\", \"CORPORACIÓN CASA DE LA JUVENTUD DE KENNEDY\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 51, \"75684C48-DC00-4967-A0E7-4133960423B7\", 51, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CLAN BOSA NARANJOS\", \"7761551\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 70A 80I 15 SUR\", \"BOSA\", \"BOSA CENTRAL\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 52, \"75CBB817-4F3D-4ABE-889D-3A5546EB22D7\", 52, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"ACADEMIA DE BAILE ALMA DE TANGO\", \"2558185 -  4815923\", \"3105506857\", \"academiaalmadetango@hotmail.com\", \"http://www.almadetango.co/#/showreel\", \"KR 27 51 10\", \"TEUSAQUILLO\", \"GALERIAS\", \"GINNA MEDINA\", \"2002\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 53, \"A8C665F6-9C05-4CB0-ACF7-59E2875E334B\", 53, 1468442657, \"956448\", 1468442657, \"956448\", null, \"9\", \"CENTRO DE DESARROLLO COMUNITARIO LAGO TIMIZA\", \"4542329\", \"N.D\", \"CMEDELLIN@SDIS.GOV.CO\", \"http://www.integracionsocial.gov.co/\", \"KR 74 42G 52 SUR\", \"KENNEDY\", \"TIMIZA\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"N.D\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 54, \"C307C0E9-3E71-4384-9907-005828412AC4\", 54, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CENTRO DE DESARROLLO COMUNITARIO ARBORIZADORA ALTA\", \"7172740 EXT 107\", \"3158232804\", \"fundadoronline@gmail.com\", \"http://www.integracionsocial.gov.co/\", \"CL 70 SUR 34 05\", \"CIUDAD BOLÍVAR\", \"JERUSALEM\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"1994\", \"PÚBLICO\", \"DISTRITAL- LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 55, \"24CC6295-9AF5-42E4-856C-4DC74D600D26\", 55, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CENTRO CULTURAL GABRIEL MEJÍA BETANCUR\", \"2124087 - 2124047\", \"N.D\", \"ypava@pedagógica.edu.co\", \"http://www.pedagogica.mineducacion.org/\", \"CL 73 14 53\", \"CHAPINERO\", \"CHICO LAGO\", \"INMOBILIARIA CAPRI\", \"2003\", \"PÚBLICO\", \"NACIONAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 56, \"7C0C62C1-A8BF-4E2E-B2A8-69E02A52A5CA\", 56, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CORPORACIÓN INSTITUTO DE CULTURA BRASIL COLOMBIA\", \"2115511\", \"3138628736\", \"informacion@ibraco.org.co\", \"http://www.ibraco.org.co/\", \"KR 9 70A 11\", \"CHAPINERO\", \"CHICO LAGO\", \"CORPORACIÓN INSTITUTO DE CULTURA BRASIL COLOMBIA\", \"1995\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 57, \"5AC32FED-DFB9-4A95-B991-33F0EB83A993\", 57, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO CULTURAL ASOCIACIÓN DE VECINOS GRANJA DE SAN PABLO\", \"3611822- 2724970\", \"30108898193\", \"sincudesco@gmail.com\", \"N.D\", \"KR 12J 33 26\", \"RAFAEL URIBE URIBE\", \"MARCO FIDEL SUAREZ\", \"CENTRO CULTURAL ASOCIACIÓN DE VECINOS GRANJA DE SAN PABLO\", \"1984\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 58, \"CA99E827-15C9-440D-BC3C-331CE910DA44\", 58, 1468442657, \"956448\", 1468442657, \"956448\", null, \"7\", \"FUNDACIÓN CULTURAL TEA TROPICAL\", \"4484018\", \"N.D\", \"teatropical@gmail.com\", \"N.D\", \"KR 77 49 09 SUR\", \"KENNEDY\", \"TIMIZA\", \"FUNDACIÓN CULTURAL TEA TROPICAL\", \"2000\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 59, \"229566FA-8492-4DEC-9FE1-13332D4CD8CE\", 59, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CASA DE LA CULTURA AFROCOLOMBIANA - SEDE FUNDACIÓN CULTURAL - COLOMBIA NEGRA\", \"3367204\", \"N.D\", \"colombianegra@gmail.com\", \"N.D\", \"KR 5 26B 52\", \"SANTA FE\", \"LA MACARENA\", \"CASA DE LA CULTURA AFROCOLOMBIANA - SEDE FUNDACIÓN CULTURAL - COLOMBIA NEGRA\", \"1987\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 60, \"5E373435-17B9-4655-B222-53BF50D8498F\", 60, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"SALA DE CONCIERTOS DE LA FUNDACIÓN ORQUESTA SINFONICA JUVENIL FOSCJ\", \"2322171 - 2322173\", \"3115214988\", \"sinfonica.juvenil@gmail.com\", \"http://www.fotomuseo.org/\", \"KR 16 49 52\", \"TEUSAQUILLO\", \"GALERIAS\", \"FUNDACIÓN ORQUESTA SINFÓNICA JUVENIL\", \"1980\", \"MIXTO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 61, \"6A03562B-DEC8-43A9-825E-3977BEF5EC5D\", 61, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CENTRO MUSICAL LISBOA\", \"N.D\", \"3202011782\", \"CONSTANZABARRERO@FUNDACIONBATUTA.ORG\", \"http://www.fundacionbatuta.org/\", \"CL 136 154 11\", \"SUBA\", \"TIBABUYES\", \"FUNDACIÓN NACIONAL BATUTA\", \"2007\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 62, \"7BD0D3A5-3EAD-43F9-B305-A98428369AD1\", 62, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"FUNDACIÓN GILBERTO ALZATE AVENDAÑO\", \"3431223 - 2864610\", \"N.D\", \"amejia@mincultura.gov.co\", \"N.D\", \"CL 10 3 16\", \"CANDELARIA\", \"LA CANDELARIA\", \"FUNDACION GILBERTO ALZATE AVENDAÑO\", \"1974\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 63, \"8621E14A-402D-447C-A0FF-299E9F087885\", 63, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"MUSEO DE ARTE CONTEMPORANEO Y TEATRO MINUTO DE DIOS\", \"2525890  EXT 6185- 6343\", \"3167429361\", \"CCULTURAL@UNIMINUTO.EDU SCROMERO@UNIMINUTO.EDU\", \"https://macbogota.wordpress.com/\", \"KR 74 82 A 81\", \"ENGATIVÁ\", \"MINUTO DE DIOS\", \"CORPORACIÓN UNIVERSITARIA MINUTO DE DIOS-UNIMINUTO\", \"1962\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 64, \"15235D27-F9C8-4435-9114-A350647C8E0B\", 64, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"INSTITUTO CULTURAL LEÓN TOLSTOI\", \"4801226 - 2823427\", \"N.D\", \"icleontolstoi@gmail.com / icleontolstoi@yahoo.com\", \"http://www.institutoleontolstoi.com.co/\", \"CL 12C 3 86\", \"CANDELARIA\", \"LA CANDELARIA\", \"INSTITUTO CULTURAL LEÓN TOLSTOI\", \"1983\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 65, \"EFB1C165-97DA-49B9-8ABA-DDAB18E9F710\", 65, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"ASOCIACIÓN HIJOS DEL SUR\", \"N.D\", \"N.D\", \"asociacionhijosdelsur@gmail.com\", \"http://asociacionhijosdelsur.blogspot.com/\", \"CL 75A SUR 1C 29\", \"USME\", \"GRAN YOMASA\", \"ASOCIACIÓN HIJOS DEL SUR\", \"2011\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 66, \"5B90B85E-655B-49C0-A91F-C13D2EF05E48\", 66, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"CENTRO DE DESARROLLO COMUNITARIO SAMORÉ\", \"2048323\", \"N.D\", \"JMALDONADO@SDIS.GOV.CO\", \"http://www.integracionsocial.gov.co/\", \"CL 41A 31 46\", \"RAFAEL URIBE URIBE\", \"QUIROGA\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"1957\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 67, \"1F79CC17-0286-46B8-B231-5D318A711938\", 67, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"ESPACIO ADECUADO FONTIBÓN BAOBAD\", \"N.D\", \"N.D\", \"N.D\", \"N.D\", \"KR 100 23 22\", \"FONTIBÓN\", \"FONTIBON\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 68, \"15CF94CF-67C2-44D8-8707-6A15BAAE0294\", 68, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"ESCUELA POPULAR NOKANCHIPA\", \"N.D\", \"3124978123 - 3133259767\", \"N.D\", \"N.D\", \"KR 100A 41 85 SUR\", \"KENNEDY\", \"PATIO BONITO\", \"ESCUELA POPULAR NOKANCHIPA\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 69, \"CA102C30-12AB-46B7-9F8A-4FBEE63F9974\", 69, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO MUSICAL FONTIBÓN\", \"2672408\", \"N.D\", \"LADYLADINO@FUNDACIÓNBATUTA.ORG\", \"http://www.fundacionbatuta.org/\", \"CL 20B 97B 88\", \"FONTIBÓN\", \"FONTIBON\", \"FUNDACIÓN NACIONAL BATUTA\", \"1996\", \"PÚBLICO\", \"NACIONAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 70, \"8C071CEA-3D51-4D1D-82C0-510AF65D1A76\", 70, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CLAN MÁRTIRES LA PEPITA\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 25 10 78\", \"LOS MÁRTIRES\", \"LA SABANA\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 71, \"C5DE932E-C351-468A-96AD-FDB72124CCBE\", 71, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"ESCUELA DE MÚSICA Y AUDIO FERNANDO SOR\", \"3407771 - 3407772\", \"3152409894\", \"pilarcortes@fernandosor.edu.co\", \"http://www.fernandosor.edu.co/\", \"AC 26 34A 37\", \"TEUSAQUILLO\", \"QUINTA PAREDES\", \"ESCUELA DE MÚSICA FERNANDO SOR S.A.S\", \"1991\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 72, \"09220E69-381E-4E06-B879-06808922D283\", 72, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CENTRO MUSICAL SANTA BIBIANA\", \"6021099\", \"3182078900\", \"BATUTASANTABIBIANA@HOTMAIL.COM\", \"http://www.fundacionbatuta.org/\", \"CL 106 17 17\", \"USAQUÉN\", \"SANTA BARBARA\", \"FUNDACIÓN NACIONAL BATUTA\", \"1998\", \"MIXTO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 73, \"5854C651-BBFE-40BA-AA97-4CE796B52B0A\", 73, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CLAN BOSA LA LIBERTAD\", \"7843822\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 88A 59C 90 SUR\", \"BOSA\", \"BOSA OCCIDENTAL\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 74, \"11716C5A-1D73-45A4-AAD5-722857846646\", 74, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"CASONA DE LA DANZA\", \"3795750 EXT 345\", \"3114676319\", \"santiago.murcia@idartes.gov.co\", \"http://www.idartes.gov.co\", \"KR 5 ESTE 17 01\", \"CANDELARIA\", \"LA CANDELARIA\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"DISTRITAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 75, \"63AB501B-C741-4918-ACB5-DF59D5A29BF8\", 75, 1468442657, \"956448\", 1468442657, \"956448\", null, \"8\", \"INSTITUTO ITALIANO DE CULTURA DE BOGOTÁ\", \"2453824 - 2454123\", \"N.D\", \"amministrazione.iicbogota@esteri.it  \", \"http://www.iicbogota.esteri.it/IIC_Bogota\", \"CL 35 15 32\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"INSTITUTO ITALIANO DE CULTURA DE BOGOTÁ\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 76, \"14B3670A-8BE2-40CF-B0A3-1A864362C8C7\", 76, 1468442657, \"956448\", 1468442657, \"956448\", null, \"9\", \"CENTRO COLOMBO AMERICANO\", \"3347640\", \"3156259658\", \"cgallego@colombobogota.edu.co\", \"http://www.colombobogota.edu.co/\", \"CL 19 2A 49\", \"SANTA FE\", \"LAS NIEVES\", \"CENTRO COLOMBO AMERICANO\", \"1943\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 77, \"6FD48412-3B89-4445-9BA7-4529D70BE612\", 77, 1468442657, \"956448\", 1468442657, \"956448\", null, \"8\", \"CASA DEL VALLE\", \"3230853\", \"N.D\", \"embajadacasadelvalle@valledelcauca.gov.co\", \"http://www.valledelcauca.gov.co/casadelvalle/\", \"CL 35 5 50\", \"SANTA FE\", \"SAGRADO CORAZON\", \"GOBERNACIÓN DEL VALLE\", \"1977\", \"MIXTO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 78, \"586D88E6-9F8D-4C81-9235-E633F4B2E9F3\", 78, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"CASA DEL HUILA\", \"2323820\", \"N.D\", \"delegacionhuila@huila.gov.com\", \"N.D\", \"CL 35 6 13\", \"SANTA FE\", \"SAGRADO CORAZON\", \"CASA DEL HUILA\", \"N.D\", \"PÚBLICO\", \"DEPARTAMENTAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 79, \"67CF2681-CA4D-43B9-A95B-87338EABDBCD\", 79, 1468442657, \"956448\", 1468442657, \"956448\", null, \"7\", \"ESCUELA DE CINE BLACK MARÍA\", \"6184719\", \"3112574719\", \"info@blackmaria.edu.co\", \"http://www.blackmaria.edu.co/\", \"KR 18 82 35\", \"CHAPINERO\", \"CHICO LAGO\", \"COORPORACIÓN BLACK MARÍA\", \"1997\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 80, \"687CDF7E-4102-428C-8ECA-1E88C00CA1BA\", 80, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN BARRIOS UNIDOS 12 DE OCTUBRE\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 55 75 40\", \"BARRIOS UNIDOS\", \"DOCE DE OCTUBRE\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 81, \"61DE9407-AC02-49A7-87B0-49606748ECC0\", 81, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"ACADEMIA SUPERIOR DE ARTES DE BOGOTA\", \"2828220\", \"N.D\", \"decanatura_artes@udistrital.edu.co\", \"http://www.udistrital.edu.co/\", \"KR 13 14 69\", \"SANTA FE\", \"LAS NIEVES\", \"UNIVERSIDAD DISTRITAL FRANCISCO JOSE DE CALDAS\", \"1991\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 82, \"C974C574-701E-4FEC-9787-AFE0531CE8D1\", 82, 1468442657, \"956448\", 1468442657, \"956448\", null, \"7\", \"ASOCIACION CULTURAL ADRA\", \"2328748\", \"3158200490\", \"adracuerpoenmovimiento@gmail.com - info@adradanza.com\", \"http://www.adradanza.com/\", \"DG 42A 20 45\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"ASOCIACIÓN CULTURAL ADRA\", \"2005\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 83, \"588F6A60-8E12-47CF-AEB4-6F5984F977AF\", 83, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN FONTIBÓN LAS FLORES\", \"350 3181309\", \"350 3181309\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 23 G 111 16\", \"FONTIBÓN\", \"FONTIBON\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 84, \"60BA1623-2650-49A1-8FAC-B0C96832E83C\", 84, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"ESPACIO ADECUADO FONTIBÓN MISAK\", \"N.D\", \"N.D\", \"N.D\", \"N.D\", \"KR 125 20 10\", \"FONTIBÓN\", \"FONTIBON SAN PABLO\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 85, \"ECA02EC9-1F85-40F3-A624-0C648BC84A28\", 85, 1468442657, \"956448\", 1468442657, \"956448\", null, \"6\", \"COMPAÑÍA AMERICA DANZA\", \"7521062\", \"3108750987\", \"info@americadanza.org\", \"http://www.americadanza.org/\", \"KR 59 45A 40\", \"TEUSAQUILLO\", \"LA ESMERALDA\", \"COMPAÑÍA AMERICA DANZA\", \"2008\", \"MIXTO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 86, \"E97FBA6B-7BD4-48D7-9E51-2047C276F564\", 86, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"CENTRO MUSICAL SAN RAFAEL\", \"6332363\", \"3105539045\", \"ANACAICEDO@FUNDACIONBATUTA.ORG\", \"http://www.fundacionbatuta.org/\", \"CL 135 52 A 55\", \"SUBA\", \"EL PRADO\", \"FUNDACIÓN NACIONAL BATUTA\", \"2009\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 87, \"6680F0B3-7B7F-4CE4-81F8-9E92E9EA1785\", 87, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CASA NACIONAL DE LA CULTURA AFROCOLOMBIANA (CASAFRO)\", \"8003436 - 2554057\", \"N.D\", \"cas.afro@hotmail.es\", \"N.D\", \"CL 73 20A 60\", \"BARRIOS UNIDOS\", \"LOS ALCAZARES\", \"CASA NACIONAL DE LA CULTURA AFROCOLOMBIANA\", \"2006\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 88, \"B2837F5B-4AAB-466D-9BB7-CEE96628681E\", 88, 1468442657, \"956448\", 1468442657, \"956448\", null, \"12\", \"CLAN KENNEDY LAS DELICIAS\", \"N.D\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"AK 72 43A 62 SUR\", \"KENNEDY\", \"CARVAJAL\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 89, \"036EAB52-3E36-49E8-87BE-80FBA9760015\", 89, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CASA SANTANDER\", \"2885373\", \"N.D\", \"casadesantander@gmail.com\", \"http://www.santander.gov.co/\", \"KR 5A 35 39\", \"SANTA FE\", \"SAGRADO CORAZON\", \"GOBERNACIÓN DE SANTANDER\", \"1989\", \"PÚBLICO\", \"DEPARTAMENTAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 90, \"8AE4217A-39E8-48BC-BD1F-8491CACAD663\", 90, 1468442657, \"956448\", 1468442657, \"956448\", null, \"2\", \"SAN JOSE FUNDACIÓN DE EDUCACIÓN SUPERIOR INSTITUCION TECNOLOGICA\", \"3470000\", \"3166066390\", \"BIBLIOTECA@FESSANJOSE.EDU.CO\", \"http://usanjose.edu.co/\", \"AK 14 63 21\", \"BARRIOS UNIDOS\", \"LOS ALCAZARES\", \"SAN JOSÉ FUNDACIÓN EDUCACIÓN SUPERIOR\", \"1996\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 91, \"856B2869-9FA6-420B-AD93-96CE43C3B7F2\", 91, 1468442657, \"956448\", 1468442657, \"956448\", null, \"11\", \"CLAN KENNEDY LA CASTILLA\", \"4122671\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"KR 75 8B 89\", \"KENNEDY\", \"CASTILLA\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 92, \"7A07E206-CD21-4F88-BE8E-0DAFBD27F961\", 92, 1468442657, \"956448\", 1468442657, \"956448\", null, \"4\", \"FUNDACIÓN RAFAEL POMBO\", \"3420836 - 5625696\", \"N.D\", \"N.D\", \"http://www.fundacionrafaelpombo.org/\", \"CL 10 5 22\", \"CANDELARIA\", \"LA CANDELARIA\", \"FUNDACIÓN RAFAEL POMBO\", \"N.D\", \"PRIVADO\", null, \"Centro cultural y artístico\" ]\n" +
            ", [ 93, \"0B41A13D-9817-4925-BD4D-05AF239E8A8A\", 93, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"CLAN FINTIBÓN VILLEMAR\", \"4159077\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 20C 96C 51\", \"FONTIBÓN\", \"FONTIBON\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 94, \"8AA7FFDA-A68A-4D79-830A-038CB6B855F2\", 94, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"ACADEMIA LUIS A CALVO\", \"3238400\", \"N.D\", \"planeac@udistrital.edu.co\", \"http://www.udistrital.edu.co/\", \"KR 9 52 52\", \"CHAPINERO\", \"CHAPINERO\", \"UNIVERSIDAD DISTRITAL FRANCISCO JOSE DE CALDAS\", \"2007\", \"PÚBLICO\", \"DISTRITAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 95, \"A395C12A-6EB3-489F-BAF5-8C26B378CC5A\", 95, 1468442657, \"956448\", 1468442657, \"956448\", null, \"3\", \"ACADEMIA DE ARTES GUERRERO\", \"6094792 - 6094795\", \"N.D\", \"contacto@academiadeartesguerrero.com\", \"http://www.academiadeartesguerrero.com/\", \"CL 45 18A 25\", \"TEUSAQUILLO\", \"TEUSAQUILLO\", \"ACADEMIA DE ARTES GUERRERO\", \"1988\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            ", [ 96, \"BDD14B67-ACB6-47E6-8F55-C5F31038E72F\", 96, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO DE DESARROLLO COMUNITARIO PABLO DE TARSO\", \"2702261 - 7411011\", \"N.D\", \"cdc.pablodetarso.tunjuelito@gmail.com\", \"http://www.integracionsocial.gov.co/\", \"DG 47A 53B 27 SUR\", \"TUNJUELITO\", \"VENECIA\", \"SECRETARÍA DISTRITAL DE INTEGRACIÓN SOCIAL\", \"1962\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 97, \"AA2F0764-63C9-4FC8-8747-927B809713F2\", 97, 1468442657, \"956448\", 1468442657, \"956448\", null, \"5\", \"CLAN BOSA SAN PABLO\", \"7828261\", \"N.D\", \"N.D\", \"http://www.clan.gov.co/clan/territorio-clan\", \"CL 68 SUR 78 H 37\", \"BOSA\", \"BOSA CENTRAL\", \"INSTITUTO DISTRITAL DE LAS ARTES - IDARTES\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro Cultural y Artístico\" ]\n" +
            ", [ 98, \"A0FC63F4-C13C-4C6C-8A41-91104937ED64\", 98, 1468442657, \"956448\", 1468442657, \"956448\", null, \"1\", \"CENTRO DE INFORMACIÓN DOCUMENTACIÓN E INVESTIGACIÓN DE SAN CRISTÓBAL\", \"N.D\", \"3115589542\", \"N.D\", \"N.D\", \"KR 7A 3 04 SUR\", \"SAN CRISTÓBAL\", \"SOSIEGO\", \"CENTRO DE INFORMACIÓN DOCUMENTACIÓN E INVESTIGACIÓN DE SAN CRISTÓBAL\", \"N.D\", \"PÚBLICO\", \"LOCAL\", \"Centro cultural y artístico\" ]\n" +
            ", [ 99, \"34FA2CCD-D6A4-4DBB-90B1-43EFA1459E48\", 99, 1468442657, \"956448\", 1468442657, \"956448\", null, \"12\", \"CORPORACIÓN ESCUELA DE FORMACIÓN MUSICAL NUEVA CULTURA\", \"2698474-2698477\", \"3105607934\", \"corporacion@escuelanuevacultura.edu.co\", \"http://www.escuelanuevacultura.edu.co/\", \"CL 29A 34A 39\", \"TEUSAQUILLO\", \"QUINTA PAREDES\", \"JORGE SOSA\", \"2010\", \"PRIVADO\", null, \"Centro Cultural y Artístico\" ]\n" +
            " ]\n" +
            "}";
    public static String enviarJson(){
        return jsonDocuent;
    }

}
