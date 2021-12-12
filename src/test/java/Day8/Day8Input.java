package Day8;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Day8Input {
    List<List<String>> input = Arrays.asList(Arrays.asList("be","cfbegad","cbdgef","fgaecd","cgeb","fdcge","agebfd","fecdb","fabcd","edb"),Arrays.asList("fdgacbe","cefdb","cefbgd","gcbe"),Arrays.asList("edbfga","begcd","cbg","gc","gcadebf","fbgde","acbgfd","abcde","gfcbed","gfec"),Arrays.asList("fcgedb","cgb","dgebacf","gc"),Arrays.asList("fgaebd","cg","bdaec","gdafb","agbcfd","gdcbef","bgcad","gfac","gcb","cdgabef"),Arrays.asList("cg","cg","fdcagb","cbg"),Arrays.asList("fbegcd","cbd","adcefb","dageb","afcb","bc","aefdc","ecdab","fgdeca","fcdbega"),Arrays.asList("efabcd","cedba","gadfec","cb"),Arrays.asList("aecbfdg","fbg","gf","bafeg","dbefa","fcge","gcbea","fcaegb","dgceab","fcbdga"),Arrays.asList("gecf","egdcabf","bgf","bfgea"),Arrays.asList("fgeab","ca","afcebg","bdacfeg","cfaedg","gcfdb","baec","bfadeg","bafgc","acf"),Arrays.asList("gebdcfa","ecba","ca","fadegcb"),Arrays.asList("dbcfg","fgd","bdegcaf","fgec","aegbdf","ecdfab","fbedc","dacgb","gdcebf","gf"),Arrays.asList("cefg","dcbef","fcge","gbcadfe"),Arrays.asList("bdfegc","cbegaf","gecbf","dfcage","bdacg","ed","bedf","ced","adcbefg","gebcd"),Arrays.asList("ed","bcgafe","cdgba","cbgef"),Arrays.asList("egadfb","cdbfeg","cegd","fecab","cgb","gbdefca","cg","fgcdab","egfdb","bfceg"),Arrays.asList("gbdfcae","bgc","cg","cgb"),Arrays.asList("gcafb","gcf","dcaebfg","ecagb","gf","abcdeg","gaef","cafbge","fdbac","fegbdc"),Arrays.asList("fgae","cfgab","fg","bagce"));
    List<List<String>> input2 = Arrays.asList(Arrays.asList("gbcead","cfgaeb","beadf","adb","egafd","fbeac","dbfegca","fdaceb","dbfc","bd"),Arrays.asList("dfcb","gedaf","dcfb","bcfdea"),Arrays.asList("dgfcb","gcdeafb","eg","egb","fcdebg","cegf","becad","dfbcag","fbgdea","gecdb"),Arrays.asList("dbfcge","dacbe","bge","fgdbca"),Arrays.asList("bgdacf","ga","egab","bfeacdg","bfaec","agc","efbcda","agfec","cfedg","abfceg"),Arrays.asList("bega","cga","febac","aebg"),Arrays.asList("cbgfad","ed","ecdgfb","dge","deabg","fgdab","geacb","gabfced","dfae","dbgfea"),Arrays.asList("afed","dfea","de","eabgc"),Arrays.asList("fdaegb","fae","acedgfb","dgbae","fedcb","daefb","gebadc","af","bcfgae","gafd"),Arrays.asList("egadb","afdbe","eaf","af"),Arrays.asList("cfg","cegbdf","fecgb","fg","cdageb","fbgcad","egfd","gdcbe","eafcb","abdgcfe"),Arrays.asList("gdbace","fbgce","gecfb","bdfcge"),Arrays.asList("bgcfed","aebgdcf","gcbd","edbcf","ecdfag","ebc","efcdg","bc","befacg","daefb"),Arrays.asList("dfabe","edbfc","cdebf","gbcfea"),Arrays.asList("dbfge","cfebd","dega","facbge","adbgcfe","bfage","fgdeba","gfdbac","gd","dgb"),Arrays.asList("bgd","eabcfg","bcdfega","egafdcb"),Arrays.asList("ae","egca","gdeabf","gcfba","fcdbag","dafcbge","dbcfe","efa","ebgcaf","fbcae"),Arrays.asList("cdebgfa","gecdfba","dabcgef","bfceag"),Arrays.asList("dagcfb","fdegacb","cbgad","bedcg","cbgeda","cfbeg","aefgdc","abde","ed","gde"),Arrays.asList("egdbfca","gcbdae","gde","gecdaf"),Arrays.asList("fcdaeb","gecaf","eabcdfg","efcbgd","bge","cadeb","gbad","becga","cbeadg","bg"),Arrays.asList("ebg","beg","edabfc","cbeda"),Arrays.asList("ed","cdbfaeg","ecadgf","bcfde","agcdfb","cedbfg","gedb","cgdbf","def","acfeb"),Arrays.asList("abfcdge","ed","bdge","ed"),Arrays.asList("gfdac","afg","ecgfba","af","ecadbg","bfda","adcgb","dbcfaeg","bdcagf","cgfed"),Arrays.asList("gabcef","bfad","gbecda","degbca"),Arrays.asList("faedg","ba","cbdgf","ceadgf","gdbfea","adbgf","aecdgb","efab","agcdebf","dba"),Arrays.asList("fedagc","bgdfc","ab","afbdg"),Arrays.asList("eadfb","ecbdg","ebgadc","bfc","gcef","egbcfd","fbcdega","bcefd","gcbdaf","cf"),Arrays.asList("bagdecf","bgceda","beadcg","fecg"),Arrays.asList("begdac","eabdc","cabef","de","facdbg","acegdfb","adcgb","edcg","dbegfa","ead"),Arrays.asList("gabfdc","gbcfda","daegfb","ed"),Arrays.asList("dfgcb","ef","fce","gcdef","bcgafe","gdaefcb","dcgebf","dfbe","agcde","gdafbc"),Arrays.asList("ceagbf","fbgdc","cfged","gecfd"),Arrays.asList("gefcd","fcdeba","bf","fbgedac","egadbc","aedcb","fcb","bdecf","fbeagc","afbd"),Arrays.asList("fbc","fgabdec","ebcdf","gcdef"),Arrays.asList("cagdeb","bed","gcbfe","fdae","cgdfbea","dgfeb","eafdgb","ed","agfbd","cgfbda"),Arrays.asList("dgbef","gbfdeac","fgbdace","ed"),Arrays.asList("bdgea","eabcdf","efbgc","edfgcba","fed","df","ecgdbf","bedgf","egacbf","fdgc"),Arrays.asList("efd","fdbaec","befcg","ebcgfa"),Arrays.asList("ced","edgaf","gacebd","ce","fdabc","fgcdab","cdaef","cefgbda","fcaebd","ebfc"),Arrays.asList("ec","fdbcae","fedag","aecfd"),Arrays.asList("fcgdb","cfbdge","agdefb","af","abgcfed","decga","cdbfag","fcab","dfgac","dfa"),Arrays.asList("agefdb","adgcfb","adceg","cafb"),Arrays.asList("cfag","fgbedac","gedfc","cfead","cgdafe","gef","fdebac","ebdgc","fg","agefbd"),Arrays.asList("fg","egf","egdcb","gcaf"),Arrays.asList("baecdg","gec","gefdab","gcfead","agcb","gc","acdgfbe","edgbc","dbcef","gbade"),Arrays.asList("cagb","acefgd","gc","cabg"),Arrays.asList("cgefb","bgdface","ecgbfd","gcebaf","bface","egbfad","ae","fea","gcea","bcdaf"),Arrays.asList("dbcfa","fea","aedbcfg","ae"),Arrays.asList("dfgabc","cdfgeb","ce","gefcba","fcbde","degc","cfbdg","bce","feadb","defgbac"),Arrays.asList("fdcbe","bdfgce","cfbdg","abefdgc"),Arrays.asList("dageb","dcbfga","dg","eadcgfb","edcg","bgcead","eafbd","gad","fceabg","egcba"),Arrays.asList("bgaecf","acdgbe","dg","dag"),Arrays.asList("edfacbg","bgcadf","adebgf","gbdca","fb","becagd","bfgdc","cefgd","dbf","bafc"),Arrays.asList("fb","agebfd","dfacgeb","cbgafd"),Arrays.asList("bedgafc","cbd","cefdgb","ebca","dbeafg","dfbea","bdafc","cb","dgfac","dbaecf"),Arrays.asList("bfadc","adfeb","fcabegd","fcbda"),Arrays.asList("gb","ebgfdac","fbag","fbaecd","fbdage","ecfdg","dceabg","bdg","gdbef","afdbe"),Arrays.asList("ecfabd","bg","gdb","bgaf"),Arrays.asList("ebdfcag","dbfgae","abcf","bdegfc","bgfdc","abd","edgca","bdacg","ba","dabcfg"),Arrays.asList("bagcefd","gafcdb","caefbgd","dcefgab"),Arrays.asList("cgfd","fcbae","geafd","egc","cg","bgdcea","fedbag","acedfg","fgeca","dabegcf"),Arrays.asList("caegf","fcgd","faegbd","ecdgba"),Arrays.asList("dacefgb","gdcab","cbeg","ge","dabecg","afcde","daecg","dfeabg","fbdcga","gae"),Arrays.asList("egdabc","deabcg","ebfcdga","aeg"),Arrays.asList("bgaced","ebdg","cgd","abegfc","gdfbcae","bgace","dg","cfeda","cgdea","adfcgb"),Arrays.asList("cfbage","bgde","dg","aecgb"),Arrays.asList("gfedabc","bc","gebad","facgd","ebcg","edcgba","dfabeg","cdb","dbagc","abdcef"),Arrays.asList("gaedb","abdfce","gbec","gecb"),Arrays.asList("ecfgd","adgbcfe","adgcbe","bdfegc","gefa","dbacf","cfgda","ga","acg","fadceg"),Arrays.asList("ag","ga","adbfc","faeg"),Arrays.asList("ced","edbgf","afebgcd","dfegbc","bgfead","cfge","ce","gbcde","abedfc","cbagd"),Arrays.asList("cdbag","ecgf","edc","dce"),Arrays.asList("aefcgb","fbdcage","bdfe","cefdgb","bcgde","ef","fgcad","efdgc","efc","edacgb"),Arrays.asList("dfacg","cgabfe","ecf","dfcga"),Arrays.asList("aed","cgbaedf","eacdg","dfgac","dfaebc","gbde","bcaegd","aecgb","ed","fagbce"),Arrays.asList("ed","feadbc","dbeafc","de"),Arrays.asList("decbaf","bdeafg","acbf","gceda","bcdgfea","af","afdce","fgbecd","fad","cfbde"),Arrays.asList("af","bagfed","eadbfc","fdcae"),Arrays.asList("ebacgd","fagdb","dgcefa","ebg","fedgcba","adbeg","eb","abce","fgdbec","cdage"),Arrays.asList("gcdeba","ecab","bcae","ebfdgc"),Arrays.asList("cfdb","daf","gacfe","dfagbc","ecfbagd","dcbag","fd","adecbg","fagdc","dafgbe"),Arrays.asList("cdfb","dfa","ceafg","fgabed"),Arrays.asList("bgfedc","beadc","gecdb","dcegafb","gb","edgacf","begcaf","fdgb","gefcd","geb"),Arrays.asList("ecbadgf","ebcafg","fgedc","ebg"),Arrays.asList("bde","afcegd","beadgc","fcaebd","edgbfac","aefcd","dfabe","bfce","gafbd","be"),Arrays.asList("eafdbc","bcef","efgdac","gfabd"),Arrays.asList("bdfgae","ebfad","fbc","bdefc","afec","dbagcf","cgefbda","acefbd","fc","cgbde"),Arrays.asList("cebfd","fgbaed","gfcadb","bfdagce"),Arrays.asList("abgf","dabfec","ebacg","gdeac","ebg","bface","egcabfd","fgcbde","bg","eagfcb"),Arrays.asList("agecd","gcaebf","beg","fabcde"),Arrays.asList("adecb","aedbgc","geabc","gcabef","fabed","afbcdg","cd","dbc","dgabfec","ecgd"),Arrays.asList("beacfg","dcge","dceg","cgde"),Arrays.asList("agcdfe","egabcd","cfgaedb","bcgea","fcgdeb","eac","deba","agcfb","ae","cgbde"),Arrays.asList("bfcegd","fdacbeg","bedcfg","cfedag"),Arrays.asList("fdebagc","gdefb","dfabg","gcabdf","ba","acegdf","acedgb","adfcg","bad","abcf"),Arrays.asList("fgdac","fgadc","bdgaec","abfc"),Arrays.asList("cbfd","bc","fdgeb","eagcd","becgd","bce","gbfecd","dgeabf","befgac","ecgbdaf"),Arrays.asList("bfgced","cedgbf","cb","cegfbd"),Arrays.asList("fedbg","ebdcf","aefgd","fcgeda","bg","ebagcf","bge","bdefag","dbga","afegcdb"),Arrays.asList("bfecd","gdab","gbad","debcf"),Arrays.asList("gcfeab","bd","dbe","ecgabdf","edfba","gbacde","bdfg","gbaefd","bgaef","edfac"),Arrays.asList("cefad","db","aecdf","bfcage"),Arrays.asList("fcedba","edc","dc","fcda","gefcab","ebcaf","efgbdca","cbeda","dfbgec","gebda"),Arrays.asList("ced","dbgfec","gdebcf","aebcf"),Arrays.asList("fgce","eacdbf","cbdfga","gbfae","deacfgb","eagbd","gaf","feabc","fbceag","fg"),Arrays.asList("afcgbd","cfegba","bagef","fdcbea"),Arrays.asList("dfabge","dge","cbdfea","cbgd","gd","fdceb","gfdebac","agcef","edgfc","bfcdeg"),Arrays.asList("fcdbge","dg","cdefg","fcadbe"),Arrays.asList("gbeca","fbg","cdfeb","dbaceg","fdacbg","fgae","cfegb","aegcfb","gf","dfgbeac"),Arrays.asList("abegfc","fecdb","efag","gbeafcd"),Arrays.asList("gacfeb","cd","cdbaegf","aebcg","dgebf","bdcafe","adgc","bdcge","aebgcd","bcd"),Arrays.asList("fbceda","edcbg","edbacg","befdca"),Arrays.asList("dgaeb","afegdcb","adfgce","cabde","gb","gfaed","gebf","gbd","dbagfe","fbgcad"),Arrays.asList("gbd","gbdefa","cgfadeb","becda"),Arrays.asList("efg","gdfa","ecadf","eagfc","cgaeb","febdcg","gf","edcfga","befadc","gebfcda"),Arrays.asList("gdfa","ebdacf","abgce","fg"),Arrays.asList("dbg","cbadf","gefbc","egfadb","bgcfd","efdbgac","gd","ebfcgd","bcgefa","ecdg"),Arrays.asList("dbfcg","dgb","fcgbd","dbg"),Arrays.asList("dbfecg","facdeb","fbadc","gf","gbdfa","gfb","ebdag","dbafcg","egdfbac","gcaf"),Arrays.asList("dcfbag","gfca","gbf","fgcdbe"),Arrays.asList("cefgab","fgdb","dge","aegbf","cbgaed","gd","bfdgcae","dfega","abfdeg","deafc"),Arrays.asList("feacd","bdgf","gbdfae","eafcd"),Arrays.asList("dcae","ea","facbged","efa","fagbc","cefab","aefbdc","afgebd","edbcfg","edfcb"),Arrays.asList("fbgdce","cbfga","efgbcda","eadc"),Arrays.asList("geafbcd","fecbag","fba","dgbfc","dbface","bceadg","cbdfa","fa","bdace","eadf"),Arrays.asList("af","dabcfe","cafdb","cbaed"),Arrays.asList("efbgdc","dga","gcbfd","agfb","gfcdab","dbgfeca","fegdca","abedc","ag","badgc"),Arrays.asList("cbdgf","febacdg","cfdbg","gedbfca"),Arrays.asList("edagfb","gcda","ebfadgc","dgcbef","bgc","gc","gbcadf","gabfc","agbdf","abecf"),Arrays.asList("ebgdcf","cdga","bafdg","afcbg"),Arrays.asList("daebg","cfaegdb","fgabe","agedcb","bda","bd","fcdabg","aedgc","eadcfg","cebd"),Arrays.asList("cdeb","ecdga","db","geabf"),Arrays.asList("dgef","fcbged","ef","bfcage","dbfcg","cefdb","caefbgd","daceb","fbe","gfbadc"),Arrays.asList("gdef","dcgbf","daefcgb","dbgcf"),Arrays.asList("ga","bcfeagd","afbg","fgead","fegabd","becfdg","age","edbgf","bgdeca","dface"),Arrays.asList("eag","ga","bgfa","gfdeab"),Arrays.asList("adge","fbgcead","dabcf","de","cdbfeg","fbega","fcaebg","bed","fabde","faegbd"),Arrays.asList("abfed","gdea","fbdae","ebd"),Arrays.asList("gae","ae","gcefbd","bcaefgd","edbgc","gdfab","debag","dfecga","gbdcea","abce"),Arrays.asList("egdbca","afgdb","ae","cdeagb"),Arrays.asList("cabgef","ed","fbadg","ecbd","edcbfa","cfdaeg","afedb","ade","ecdgabf","afbec"),Arrays.asList("fcgbeda","cebd","dabfg","cafebg"),Arrays.asList("fdbcae","ceadf","dcgbfe","cad","ebdcfag","ecfbd","eafcg","deba","ad","gcfabd"),Arrays.asList("fecag","daeb","cad","ebcdf"),Arrays.asList("cf","egbfc","cfbgeda","gfc","gbdce","begafd","facbge","afbeg","fcea","gcdafb"),Arrays.asList("fc","fc","afce","cf"),Arrays.asList("abdecg","deg","gcbd","efgbda","gacdfeb","ecagf","badce","dg","dafbce","dgcea"),Arrays.asList("dcaeb","abcfed","efacg","gd"),Arrays.asList("cbgefa","dcbage","abecgdf","cdga","fgebcd","ca","cbdeg","eac","dbcae","eafdb"),Arrays.asList("ace","dgecb","befcga","cea"),Arrays.asList("gef","fg","dgaebf","bfeac","cgfea","ecfbgad","bgfaec","acefbd","cgdae","bfcg"),Arrays.asList("fdaegcb","dceag","edbgaf","fadebc"),Arrays.asList("gbafde","adefbcg","fbaeg","ged","dg","abgd","dfbge","gfedca","caegfb","cdebf"),Arrays.asList("dgab","baegf","agfced","bgfae"),Arrays.asList("eb","caefdg","dacfe","baed","dgfbce","efbdac","efcdbag","baecf","ebc","gcbaf"),Arrays.asList("cbe","fcbade","adcef","ecb"),Arrays.asList("db","deacg","fabge","bcagde","bedc","bfdagc","adgbe","cdeafgb","bda","cfgead"),Arrays.asList("agdec","becd","abd","bd"),Arrays.asList("agcdb","fcba","efdacg","gca","bgdec","fagdb","bafgcd","beafdg","ca","caefbdg"),Arrays.asList("dgaebcf","acdfeg","cedagf","fdcgba"),Arrays.asList("bacdgfe","ge","dgeca","ecdba","bdcage","cebafd","efabdg","egbc","dfgac","egd"),Arrays.asList("egd","gbce","abecd","afbdecg"),Arrays.asList("bdfa","aegcfb","gfa","daefg","fa","gaedc","dcgebf","bacefgd","abdefg","gebfd"),Arrays.asList("fadb","fga","dgeabf","bafgec"),Arrays.asList("dfecb","adcefgb","dcbea","bagc","dfbeag","bea","ab","degcba","efgacd","dcaeg"),Arrays.asList("bae","cfdgae","daceg","bfced"),Arrays.asList("fbcde","fdgb","deg","cdfega","dg","cageb","gbedc","afdebcg","bcdfeg","cebdfa"),Arrays.asList("bfdec","dbecf","abecfd","cegbd"),Arrays.asList("fagdebc","eafgcd","gbaefc","def","abcde","fdcgeb","afgec","fadg","df","dafce"),Arrays.asList("fdagec","deafgc","df","adceb"),Arrays.asList("bcfaegd","begfda","bdaef","efbgca","cba","bdec","fgcda","dfebac","bdcfa","bc"),Arrays.asList("bafdc","fabdceg","cebd","eafcbd"),Arrays.asList("acbeg","fgdbca","ecdbgf","abg","eadgc","ba","adgbfce","bcefga","cgfeb","afbe"),Arrays.asList("fbgdac","fadcgb","cdfgba","gfcbe"),Arrays.asList("fbdceg","af","ebadcf","aedbf","fbcega","dfca","fea","fadcbeg","gaedb","dbcfe"),Arrays.asList("abgfce","dacf","fa","bfegacd"),Arrays.asList("ged","abegfd","aegbcd","gaec","fecbd","decbg","fgcdba","egbdfca","dgcab","eg"),Arrays.asList("eg","gfedba","efdcb","gebafd"),Arrays.asList("gfb","begdaf","cbadf","fcgedab","fgec","fbcedg","gebdca","fg","gcbdf","degbc"),Arrays.asList("gcbdf","fg","bgdfc","fgb"),Arrays.asList("dcgaef","gca","cgdabf","ac","gcdab","fabc","gfbad","adefbg","bgcde","dbeafcg"),Arrays.asList("cgbed","dafegb","ac","ac"),Arrays.asList("fgeacb","bc","bfdge","bcg","dfgcb","dacegf","badcgf","cadb","fcbaged","gafcd"),Arrays.asList("fcgad","cb","afgcd","bgdcf"),Arrays.asList("fadecg","fb","fcb","gefb","dgfcab","adefcgb","ebacfg","cabfe","becad","gcafe"),Arrays.asList("fcb","cgefba","caedgbf","gdacfe"),Arrays.asList("edcab","fgce","dgfcbea","aebfc","abgfdc","efa","fe","bcagfe","dbgfae","abfcg"),Arrays.asList("baedc","facgb","acgfb","ceafb"),Arrays.asList("bae","aefbg","dfbag","afed","bdcgfa","fegcb","afegbd","agcdfbe","ae","bdcega"),Arrays.asList("fegbc","febag","acgdbe","fgdba"),Arrays.asList("gea","dagebc","efadg","adcfg","cfgdba","edacgfb","caef","ea","gdbef","geafdc"),Arrays.asList("ea","gfade","feac","fcae"),Arrays.asList("gadc","acfdb","ag","bfdge","fbgad","fbdcage","abcfed","agf","bcdgfa","cafbge"),Arrays.asList("cdag","cagd","dbcaf","gfedb"),Arrays.asList("gacedb","abfced","fdcbe","gdfbce","ea","fcdga","eacfd","dbcafge","afbe","aed"),Arrays.asList("edcfbg","faced","becadg","cagdf"),Arrays.asList("dbcaf","bdcfe","fdgcab","ca","agfbd","acgbed","abgfedc","acfg","gafdeb","bac"),Arrays.asList("dbgecaf","bfcda","fgac","bgdcaf"),Arrays.asList("gbaef","dbagef","fab","fagd","bedgf","bdgacfe","gfdebc","fcdbea","af","acbeg"),Arrays.asList("gafd","cdbgaef","eacdbgf","fba"),Arrays.asList("gecd","beacg","bec","badfce","gbeacd","bgcad","gedfcab","ce","dbacgf","fegab"),Arrays.asList("ce","acbgd","ecabdf","afbced"),Arrays.asList("cfdbae","bdfcage","ecdfb","gfebca","cagbd","ge","cfegdb","egcdb","gedf","geb"),Arrays.asList("ge","gbaecf","bfcdage","cbgedaf"),Arrays.asList("fag","cagefbd","agce","bcdfge","ag","fabed","cgdef","degfac","geafd","gafdbc"),Arrays.asList("edfcg","fcdge","cegdbf","gfaecdb"),Arrays.asList("gdf","bacgde","eabdfcg","ebadg","fd","caegf","fecdgb","adfb","fgade","bagefd"),Arrays.asList("adbfeg","ceagdb","baefgdc","gfead"),Arrays.asList("cadgf","cfabdg","bfgaedc","gbade","cgdeaf","cgef","acdefb","efd","gaefd","fe"),Arrays.asList("def","beagcfd","deabg","gecf"),Arrays.asList("ag","aeg","bfegacd","badec","badg","gdecaf","afbced","gcaeb","bfegc","cbeadg"),Arrays.asList("baced","gabd","becad","egcfad"),Arrays.asList("bgad","eabcdg","acedfb","gdfecb","ab","eba","bcgeafd","bcega","edgbc","gefca"),Arrays.asList("egcaf","gbedc","ba","ecbgad"),Arrays.asList("gbacf","cegfab","fdbcea","gaec","fgc","fdabg","cdfbgae","cg","egbdfc","cefab"),Arrays.asList("cfg","fcbgdea","fabdec","fbceag"),Arrays.asList("debfg","bdefga","db","gebfa","gedcf","bcafde","edb","cfaebg","gbda","cdbeagf"),Arrays.asList("edafgb","aegbdf","egdcf","bdga"),Arrays.asList("fabdegc","eacdb","baceg","afdceb","bdefc","gfbead","dab","fgecdb","cfda","da"),Arrays.asList("cbage","da","ecfdb","dceafb"),Arrays.asList("gcfdba","gacdb","gabdf","efbcdg","cafd","cbdafge","dc","aefbgd","cdb","agecb"),Arrays.asList("cdegbf","acbdg","bcdag","facd"),Arrays.asList("ebd","bfacge","aegfb","de","edfa","fdgeb","aefdgbc","abfged","gdfbc","dgbeca"),Arrays.asList("fbgcd","ed","ed","de"),Arrays.asList("cdaef","acfegd","bfce","eabfd","fgdabec","egcbad","be","gdfba","bde","eafdbc"),Arrays.asList("be","bed","eb","eb"),Arrays.asList("de","bedf","bcgaed","fedgbca","cabgef","ead","cadebf","cbfea","fcead","dfacg"),Arrays.asList("geabfc","eda","eacbdg","bgecfa"),Arrays.asList("dfaec","egfcd","egc","cg","egfcad","ebcgaf","dcfbae","gbfde","fcebagd","acdg"),Arrays.asList("ceg","dacfgbe","begfd","dbcafe"),Arrays.asList("cdbg","gacfd","gb","ebfad","agefcb","efacdg","cfdeagb","gdfba","gbdacf","bga"),Arrays.asList("bdfga","gdcb","bfgace","dbcafg"),Arrays.asList("abfdeg","fadec","dagcbf","gecadbf","egabfc","abefg","befda","edgb","bdf","db"),Arrays.asList("dbeg","db","bdge","dbfecag"),Arrays.asList("ebdafc","gbdcf","geabcfd","caedf","gdecf","fage","gce","bgeadc","ge","egfdca"),Arrays.asList("egc","gec","gfdec","adbfce"),Arrays.asList("afdc","fgdaeb","dba","ad","acebf","ecagbf","daegbcf","edacb","eadfbc","bedgc"),Arrays.asList("cgeafb","dgceb","dba","edbgaf"),Arrays.asList("ebd","be","cafgde","gfcbed","gdaef","gbcad","bdfaeg","efab","efbgdca","ebgda"),Arrays.asList("edcfga","dafeg","cefbagd","gfdae"),Arrays.asList("cdefa","fdceag","gabefc","afdb","caebd","ba","begcd","ebdcgaf","dcebfa","acb"),Arrays.asList("cadfbe","dacbe","bca","fabd"),Arrays.asList("edga","fcbade","fea","egfab","gebfc","ae","dfcagb","dgbaf","adgfbec","dfbgea"),Arrays.asList("bdfagc","fbceagd","fae","gbcfaed"),Arrays.asList("ebgaf","fgadc","becfdg","caeb","dbfage","cb","gbc","gadfbce","bgacf","gbacef"),Arrays.asList("abdfeg","bc","begcdf","ceba"),Arrays.asList("dfgac","feda","ecabfgd","eacfg","fbdgc","gad","aefgdc","cegbaf","ad","egdcba"),Arrays.asList("febdgca","aefd","fdcga","cfdag"),Arrays.asList("daecb","gdcabe","bgdcfae","decbfa","efdcg","cdbge","dabg","bg","bcg","bgfcea"),Arrays.asList("ebcgd","aecbfd","debcfa","bfeagc"),Arrays.asList("gf","dbfcg","acbdf","fdbeacg","dgebac","gedf","aefcgb","cfg","fgcdeb","cgbed"),Arrays.asList("dgfe","efdg","defg","bedgc"),Arrays.asList("afgbdce","fgcbe","dgbe","bcfdea","gbcfd","dbc","febcga","gecbdf","dgcfa","db"),Arrays.asList("gacebf","ebdg","bcd","dgeb"),Arrays.asList("fcadge","geadfbc","db","gdcae","gebcd","bdg","gafbde","gcbfe","dbgcae","abdc"),Arrays.asList("abegdc","gfecb","begafdc","bd"),Arrays.asList("fc","dacebf","befcd","fbegdca","feca","dafeb","fedbag","dbcge","fadbgc","fdc"),Arrays.asList("ecfdb","cfd","acef","edagbf"),Arrays.asList("aeg","gfebac","dbcfea","fgde","gadcb","ge","fecdag","egcad","cfead","bgedfca"),Arrays.asList("fdgcae","edfg","dafec","dfcae"),Arrays.asList("gedca","fcabdg","fcabeg","dgfbae","eb","becf","fcbga","eacgb","bae","faecgbd"),Arrays.asList("fgbac","fdcbgea","aeb","fgacb"),Arrays.asList("fbcegd","badfg","fdeab","agdefc","abecgfd","dgfbc","adg","ga","bagc","gbfcad"),Arrays.asList("ga","abgc","efacbgd","agfbd"),Arrays.asList("acfebdg","gbc","gc","cgbfae","dgbea","adgbc","bdafc","dgbeca","bfgade","gdce"),Arrays.asList("dabfecg","dagbe","ebgad","egcd"),Arrays.asList("cgfe","gdbfae","bfaecd","adgcbfe","bgdca","fg","deacf","gcfad","fcgead","dfg"),Arrays.asList("faebdg","fdcaeb","fg","gfce"),Arrays.asList("cdebgf","gb","gfbe","dgcbf","bagced","fcdge","bdg","bdfac","fdcega","dbagcfe"),Arrays.asList("fgedc","gdcef","bcdegf","cdfgae"),Arrays.asList("fgcd","cfa","edcfab","dafcge","efgab","gbceda","daebcfg","agfce","cf","adecg"),Arrays.asList("gafce","fcgaed","fac","afc"),Arrays.asList("cedgba","ac","cabf","egadf","fbegcd","aebfcd","ecdbf","dca","cgadfbe","dcefa"),Arrays.asList("ac","bgfced","fecbd","cbfadge"),Arrays.asList("dagb","ebcgd","ad","bcegdfa","dbcea","edgfac","dgceab","cgbfed","bcfea","acd"),Arrays.asList("bdfgce","bcaef","da","bgedfc"),Arrays.asList("fgdea","fgcade","ebcagf","cg","eagbfd","gce","ecfgd","cdebagf","dcga","cdebf"),Arrays.asList("gc","gc","bfadge","adcg"),Arrays.asList("fbe","debg","fgced","fcbdae","gcfab","dcgfae","egcbf","cgabedf","cdefbg","eb"),Arrays.asList("ebf","debacf","be","cafbg"),Arrays.asList("fcegba","cebadf","efgd","gaefc","adfceg","ade","fcegabd","aedgc","dgabc","de"),Arrays.asList("aegbfc","faegdbc","egfd","dgfe"),Arrays.asList("df","bfcdag","dacbefg","fagdbe","begaf","ceadb","adf","afbde","gdef","ecbfga"),Arrays.asList("geafb","faebcg","ebadf","df"),Arrays.asList("ecfdab","dcfba","debfa","ecfd","dbacegf","bcf","fgcbae","cbdga","agedbf","cf"),Arrays.asList("dcbag","eagbdfc","edbgfa","cafdb"),Arrays.asList("fed","bgdfac","edbafc","egfab","gdcfb","de","fgedbac","gced","bgedf","bdcefg"),Arrays.asList("defcgb","gbfdec","cedg","ed"),Arrays.asList("gbfcdae","dcab","ba","bgfedc","ecbafd","agfedb","fcebd","abfce","cfega","baf"),Arrays.asList("bfa","gebcdaf","bfedag","ebfgdc"),Arrays.asList("afdceg","eacfg","cbgfaed","gc","dceg","fgdcab","egfda","gbeadf","abcfe","fgc"),Arrays.asList("gdcaef","gfc","fdgaec","gc"),Arrays.asList("bfdaegc","bcaefd","edfgcb","edfgc","fdgac","faeg","af","cfa","afgdce","bagcd"),Arrays.asList("geadcf","fdabec","acf","agdcb"),Arrays.asList("ebfdc","dbag","eabcdfg","gcd","gfbaec","agcfbd","dagfec","abfcg","gd","cgbfd"),Arrays.asList("fgabc","bgad","adgb","fbdgc"),Arrays.asList("efgdcb","dacbg","afcbe","cfd","fd","gadceb","agfd","acdfb","ebagfcd","dgcbaf"),Arrays.asList("cebgdf","gdaf","bfcdeg","afbdcg"),Arrays.asList("defgb","bfce","dgeab","ef","dcbgf","gcefad","bfecgd","dfgabc","eacdbfg","def"),Arrays.asList("bfdgc","fgcbeda","ecafgd","fdcbge"),Arrays.asList("edg","bfdgeac","bagce","gbdae","egadfb","ed","dfbe","cbgfad","dgfab","gfcade"),Arrays.asList("ed","dcgaef","acbeg","ged"),Arrays.asList("abedc","gafbed","bgaecd","beadfgc","bf","dfb","gdcfa","abfcd","ecfabd","ebcf"),Arrays.asList("dcafg","fceb","dbacfe","fbdgace"),Arrays.asList("eagfc","acebg","abedfgc","feadbg","adgef","dfca","edgacf","fcg","cf","dfgebc"),Arrays.asList("fcdgeb","fgc","cdbfge","gdcbafe"),Arrays.asList("bcde","dcafgbe","ecf","debfa","ec","bgfca","bcfae","bcdfae","gbfdea","caegdf"),Arrays.asList("cef","edfab","cfbdae","cfgab"),Arrays.asList("fdecag","cd","cbfage","aedbcg","gbcaedf","cabdg","dgc","bagec","bgfad","dbce"),Arrays.asList("fcbgae","gbafd","cgd","bcfgae"),Arrays.asList("feba","agfdceb","gbfedc","gbfca","ab","bca","cadgf","gbcfe","debagc","cgbaef"),Arrays.asList("cadgf","cfaegb","gbacf","dcabeg"),Arrays.asList("adceb","cdgbaef","cefdab","ec","edc","dafbeg","ecfbgd","gdacb","feca","aedfb"),Arrays.asList("bdfegac","eafc","badfe","ec"),Arrays.asList("bacdfg","fcbeag","afdc","fabegcd","acgbf","agbdf","dag","ebdfg","ad","edbgca"),Arrays.asList("gedbf","bgdcaf","fdac","dcfa"),Arrays.asList("aefg","dgecb","eafgdc","gefdc","afcdbe","befcdga","cdfag","cef","gbcadf","fe"),Arrays.asList("ebadfc","efcbda","efgcda","bfgadce"),Arrays.asList("decf","fbgdca","ecbgfd","gbdae","df","bcfeg","dgbef","dbf","becgfad","acgebf"),Arrays.asList("fdb","fbgec","dbgfac","fcgdbea"),Arrays.asList("gcaefd","decab","cbfea","egfdbca","dafb","efgcb","bcdega","ebacfd","afc","fa"),Arrays.asList("ecbfad","caf","dbeca","caf"),Arrays.asList("abfdgc","gebaf","cb","bca","fdabceg","becf","ecadg","bacge","afedgb","agcefb"),Arrays.asList("daceg","dgfeba","bc","cgdea"),Arrays.asList("cefgdb","edfagc","gc","fdgbc","aebcdf","ebcdf","fgc","gbadf","deagcfb","gecb"),Arrays.asList("gfc","efacdb","cg","bacefd"),Arrays.asList("gbead","cgdeb","cg","fbegcad","bcefd","cbfdeg","ecfbga","gec","dgcf","fecbad"),Arrays.asList("cg","geadb","gce","gc"),Arrays.asList("agebf","cafeg","dbfagc","gecd","cg","gfceadb","cga","gafcde","defac","fbdcea"),Arrays.asList("edcaf","efdac","eagcf","cagfbd"),Arrays.asList("gbdefa","eb","cbfdag","cdeb","bcaefdg","dcbfae","febac","feb","gcafe","adfbc"),Arrays.asList("eafgc","beacf","gadfeb","ebf"),Arrays.asList("abcfe","ecgbfad","ebda","eca","gfacb","aecfgd","dgfceb","ea","fbcde","fdabec"),Arrays.asList("acdbef","deab","ebcdf","dbae"),Arrays.asList("cdaf","abgfed","ebcdgaf","deabc","fbcea","cefabd","edgbac","fa","afe","fgbce"),Arrays.asList("acbfe","bcgeda","acbef","abdcge"),Arrays.asList("eabcf","cd","gdbecf","gfcaedb","dcfg","gafdeb","fdbge","cadebg","edbfc","dcb"),Arrays.asList("bdcegf","badcegf","dbc","gfecbd"),Arrays.asList("dagfb","bfecga","efdcb","ebfcagd","cg","cbg","ebcdaf","cdgbf","dcbgef","egcd"),Arrays.asList("agfdbec","gc","ebfcad","edcg"),Arrays.asList("cfaeg","fd","bgead","efcbgd","gdefa","fcda","cgeadbf","gfd","gfbeac","adegfc"),Arrays.asList("facd","dfgae","fd","degba"),Arrays.asList("egfbd","cagde","fbeagcd","fa","aedfg","ceagfd","daf","cfag","cfedba","abgdce"),Arrays.asList("afcg","af","af","fdega"),Arrays.asList("gcdfae","aebdfg","gfc","abgec","dcbf","abfcg","fc","bdfceag","fbdag","bacgfd"),Arrays.asList("afbged","cf","cfabg","gfc"),Arrays.asList("fcbaged","bafce","cfag","gbcdfe","abecg","cfb","gbafce","dgcabe","dbefa","cf"),Arrays.asList("cf","cgfa","bcf","fc"),Arrays.asList("cfed","bdgfc","bcd","fcbegd","eagcfb","bdfag","cd","efcgb","bdcgae","dfcaegb"),Arrays.asList("cbfge","dcb","gcdabe","gcdbf"),Arrays.asList("cdg","afbcg","adec","adgefb","gebdfc","dc","gafde","adgcf","fgdeac","gdfbcea"),Arrays.asList("caed","fadge","ecbdfg","ceda"),Arrays.asList("ba","gfbca","fdcgba","egdcabf","agbdce","fgeacd","agb","cfadg","fecgb","fdab"),Arrays.asList("gcdbfa","fadb","agb","ba"),Arrays.asList("cbfda","ga","cfbag","adbcge","acg","aefg","abfgce","gefbc","gdbecf","cadebgf"),Arrays.asList("ag","dbfac","agc","bcgeaf"),Arrays.asList("bgcdea","fgdce","cg","cfga","defcb","gadfeb","gacfedb","gcd","edagf","gafdce"),Arrays.asList("fagecdb","gedfab","gbecda","facg"),Arrays.asList("fcbeg","gcabe","bcfed","gf","gfbedc","cfabed","bfcgead","gefd","fgb","fgcbad"),Arrays.asList("acbeg","adebfc","bgf","bgf"),Arrays.asList("bgcfed","gedbf","gf","egf","bgeacd","decbg","bcfgea","cdgf","bfcgade","bafed"),Arrays.asList("bgfdce","dbaef","gebcd","bfcgae"),Arrays.asList("abecd","bfcda","gcdeba","dfbe","efgbac","fcagd","bcf","fgebdac","fdbace","fb"),Arrays.asList("fgcbea","cfb","bfc","decab"),Arrays.asList("fc","cadebf","acgfb","dfgabc","bfgae","gcdf","fbceagd","adcgb","cbf","adecgb"),Arrays.asList("fdbagec","fc","aedcgb","cf"),Arrays.asList("fe","abgdef","daefg","bgcadfe","dagbf","dfbegc","bfae","gdbafc","acedg","gef"),Arrays.asList("dagcfb","baef","cgedfb","cabfgd"),Arrays.asList("gef","fegacd","cbefd","daecbg","agfd","cdefg","fg","gecbafd","dceag","cfebag"),Arrays.asList("ecgad","acbdeg","dcfbe","gdecba"),Arrays.asList("cae","fdeag","gdcbae","cagdfbe","ce","daefcg","fgce","acfdb","egafbd","acfde"),Arrays.asList("gbdaec","gafdce","ce","eac"),Arrays.asList("fdaegc","dbefgca","dcfa","fedag","fdbegc","fd","dcagbe","edf","fgeba","cedag"),Arrays.asList("efdcag","fed","dcgbfea","df"),Arrays.asList("afcegb","cadbef","efb","beadc","fcdgb","ef","fbdce","dfea","agdcbfe","gceabd"),Arrays.asList("dcafbe","eadf","fcebga","baced"),Arrays.asList("cbdfgae","cfaeg","ebgdfa","eg","gbafc","decg","gea","cbafed","afgdce","fcade"),Arrays.asList("dceafg","bdaefc","ge","faced"),Arrays.asList("acbdfg","bfc","bc","dbcg","afbcd","bfcdgea","abdgf","cfeagb","fcead","dfabeg"),Arrays.asList("egcbaf","egafdb","agfbd","egafcb"),Arrays.asList("aefgdc","bcfde","gacb","cgf","bacefgd","baegf","ebfdga","agcbfe","cg","ecgfb"),Arrays.asList("fecadg","bgfae","aegdcf","egfcba"),Arrays.asList("fdgcaeb","facdbg","dfc","dgcab","cf","caefbd","cebdga","edgfa","afcdg","fbgc"),Arrays.asList("dfc","cf","dfcga","bfgc"),Arrays.asList("cdgebf","fbegc","cgfdea","ecagfb","gfbac","aedbfcg","ac","fbagd","eabc","cga"),Arrays.asList("faegcb","ca","abgcf","ebfcg"),Arrays.asList("acbgfd","fecgdb","bcagf","abeg","ecdfa","gcfae","ge","ecg","cgbadfe","fgbace"),Arrays.asList("gec","ge","cgfba","dfcae"),Arrays.asList("aef","efadgc","cagedb","cfde","dagef","ef","aedcg","ecbagf","dcfabeg","afdbg"),Arrays.asList("ceagd","afe","fae","gefad"),Arrays.asList("dbacfe","cbf","acefg","abecdg","fdbgcae","bdfe","bfeca","bf","fgdacb","bdcae"),Arrays.asList("cedab","cefadb","edfb","fcbgaed"),Arrays.asList("ebgf","acdbfe","adfgc","baf","fb","fgeabc","adfbecg","abecg","bgafc","cedabg"),Arrays.asList("fb","bf","gceadb","dafgc"),Arrays.asList("fbcead","gadb","adebgfc","ba","aegcb","caegf","cab","ecgfdb","cbdeg","aegbdc"),Arrays.asList("decabg","edcgb","cgbfde","dcgeb"),Arrays.asList("bafegdc","becgdf","cdebfa","ecg","bfedc","gc","fcbge","eafgdc","cdbg","aefgb"),Arrays.asList("fbecd","acfedb","gbcd","cfagde"));
    private List<List<String>> signalPatterns = new ArrayList<>();
    private List<List<String>> output = new ArrayList<>();


    public Day8Input() {
        for(int i = 0 ; i < input2.size() ; i++) {
            if(i % 2 == 0) {
                signalPatterns.add(input2.get(i));
            }else{
                output.add(input2.get(i));
            }
        }
    }
}
