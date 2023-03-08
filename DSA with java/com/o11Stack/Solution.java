package com.o11Stack;
import java.util.*;
import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("gnyogdbncigrwnjjtqtyregqyhkinjxgzmkpxskloxjcensflhhxlpfkrcmuctrrqahjlmziiupsenyaagbamdkxgqswexvffjygshlkcvdmjypmpduactfnlezrltjirqntomjomkkjdotvlfjafboajhklqvboluugoorigqswfzblnzqmxrootnudnqenmtffuzhallvqmlvmhvulbasxmbtfytqrpdxthbfezwfmaenimwnjhxjhtncyhmlazjjlqxtavunztuhhxduzbwnunjeiorsjnqqtkpoomfpoomshvaolvhkaeldunxvaheorqjjsvbxijmeftlsglnijdfgnpeisacakcyogdvwaeanzinmzecqzptmaqymdtcnctdyqukzxjjoqgllpyzmoaqdbiurwgdnxzaavdvjfoplymjkhzailvdqoohdrwihokdxzfqnnpsccfwfappvpozccxfefflqpstzzxvjpgdwenirlsxfkcstwvuatmturxgczkriaalhoqylrnrullmqajxrxvmkeyrcogpjwralyvxhdinhsfeksbwdtywbdnmucgdukrcltsjqehvkbhqmhvarpupvgwxqydnbrvmxmqlddaqvalnewursnrvlcofejwjryexpvglkyjkrgigpewxdbfoacmnxjqzqumtjmyjcmnukfotapbfybhnnbgtnyvneoiiiabqonoqaykrtopgdvcnwcfhqeamvbwzgmzrjegszfzgxfasgvicxqxmllgvhqzypaapfrjrmgrwdpcvfgdgkmkwmlyymybryxyunjzglpfqbwhihtsvujejryntmqldlgtegkwxmzwfqjexuiznzycstunbzpcfrlmocijwoclexdzdkkgeflesklphhsqteplpscgsjhfrmxmwstpljhsvcqyuscnvuadidyprjqyoygvgwozqigmxtstoetsfjvvdpmmfbfnpijjybxquvfaxsfrzlecwboqqlqbffhqaynmfhfbanspotydwtdllbolveyjwrkrvnpcdmgtsikrfylusoyyqrpglmviwqzebuoxslildwbjlimytbsvrypkwgdqdcwxkbtlvklhiwhytbqycipvtuiuebszihybdrzpobnszrdhdltnnrbqbvqxjrpltvxydhmwbwswkgxzrpupoxhtdercsvhkizpjwqlqtncvyufaxtjdznojtvbplgfzgtuvrtuujfhxcxupddmduklodecnxtlgszswmowszfrqakrqnsvnvipyadbruuknkijpphdtbkxveyijdoaflwdetbagvqhksabyapmvlufeftzfkvxzrhasuianvslpfcikzrdvghokiwntuouiadysnghymcyvnworaecsffciwsmrxzcsopmifigkxbqmdsgtelajmgabzxgsqqtanmkebcpwudwwsmtfaqrxiyohfymgqcifgyvydqtpvzbrhwhntnhwrflrrayknllojkdijbbupaklzvpzlxofjiidyllitjtgxfvhxzhxbngdjvbamlouxrtfzgtfqyuthhlhiiwropqlsxazzqcjpomvwctotidohpaavhvuiwljdzeycjasacdedxpdlkxkqukhueicdxdzrbgpagenspiyuguowbmsydcxfldnfdstyqeacyrdbrbicepwevbhugzecqengmpadgkksqyycnqeilfyomjtmyulgavbogsibfoajcoqsblehgvivoibhkwuulvzawebjbusbpnthtidkgivptcwqgeealdmmsfzdlsksqyvfogzxirsyupfphvndljblgiklherznezjoqratdpaubvdicijbqiemtcfjghzxkbrryttfhpusfbkhmgmmoexltbhsoflpqdmwvhpgzkdqwpszznjimvlwhmwqpinnorgjpptpwxpwgagtubszwvgiczsfzwrmvrjwvwupapsiolbzbjitxjedfyughkzpkhujvkahsxyblsewzanydmzwlgmjvftwmsbjecdosfikvhjrqqhxmehavbyeemteuqvgoxjkpgvgrlabpypckbkkoqfauyuqojtmxmyzwgtxfgxqoxaahzpkbrbtuymrgdxmrfqmwbrpjnkqzdolptzcwmnvjxkbdahyytikvvbandzfhjjbaogoxxfyjbraqjjmoyiibmfterpaxrkreymmtpfjvztgquwbxkxrvfkegvaxwktzhvfrykrvsyrixjpfrbmzcoszektofgdpdfvqsbjfygregsygkhdfndqhoijkzloradgzbwjpnavwzdrnvptsdgfmapqmhaoakadjybfqgorzcnkaojmcotombnchjdskxavyrjtpwcjgaoilcyvqalofltksjildedotsitktyzenywwvtttuyimlnbtoxlazvmjiwvvdeikdzmuitdbxufvtdmypsunrpdnqxfcobdkfvsojfwnifscjcvypndgbyjqntwfxflyktjbpjqsnfkqpbwuahoyhgeoouulkbcnfkqlxqfynefjkwitpsmnsrhficxzcyobzodyvrvskzqeivwytfpjnqmmiuyvvzsmuqyqkolvaccbyqixtbljwhisxilhadwqejoazilbizmuzyolnfpvxfguikclbsdsgpdtezexgcrlbkkpgnftwtqtdfztkhwxwbhwlcxeinmsiiivskkrjpvznuukjzxiyajbpduurpakyigieabqdiopchzechzllywazexaqiegwmldblzylsxahzspbgwnvfklluljgolyztuonjxxhpwkyuykafgvparuerfyynxygqhtelsildgeqvcsxkmpteyotadxwnxcybayrlgvtkmlsaxcoalarzbvgbonaafidquicefrcrytzgqgxosduscpilmbbrlnriyrfsracyctdmunsmzoytixvdgrroyfapjwztamzurqwcdcbqmwvhorwtjukxjbhktvwmqhysoyvcwzzprewkgmjcfdhhohgimpzltltzxinlpukbcaevgghltiwnlbozzfitkxncpjjminjzjrhvxbgvfcuzfcpsdlcklxmbdfafqixwlmfyuckxdoyeqceiqqxysygjdlwrzkiqwihaqotvacvuadhwlfcpgazbpahgmxhqnbjuuwnkdrbtypuboeiwendakeejucjudqjwvbuqfemilgvytqsjismxlgrqltwekymjlyqzeqpjhdgacklbsfyspxnqxcyqzvqmgihhuhpbavrhdpkjqmvusvkemobcmmmuostueklvejcoyqmsjlgiuzzypvxjlvskzlkntyaiippsurcowvrnymwukxazmfnurbjgidyjzbgmqwjcfmnssdebzkavddltmsooxgbczfjhpiammeuhnzqdushgcadvluimeysgtjyznyqqqmenmadaborhcncuqutravcrthhfmthsbicnfevimbpbishsrraksjwlvdwonecuvoeevmyhmtxstkvlxenpmkkygiiyqzfrsvpxrpflpccnzvnqnbexajvciibqkhzvizcgvwnetisxyailxkrxjkkoankqyigyrmjclaqrzxyffkzcnnfhwgqgmiwpkjtgnjwvohconiugobjtnxpevvvqsxtrvhbdmmjjltkxlfkselygkyjkbkktzwqadejsgxwsqhxrjgsgmqxmlwnqbotshysrhyqpxqbiqlyzxanxcqwryaeadjjhlbpgwrfixaialnjtplrgxiafbslmjmblexbuczzllrkivtjoyinaxhdaxeklkakwgtifpdnepryvqekumvhvkqwqdhvxnmxivhsosiwhbfysmdenpcyqvjfgldyfiusdxtliiprkkdvmdzwcmgkitpbsxoyzucuijiljjgvopispzuwtltkidxsybztgyczzsgvudyvvwejqqdqjatodzltqucgnstoemxcotgqdvdrzytddqamurevcpndikbsrfhgiitwrzpaecookkciybfvwmodedewgofydbfqfgwuhyjuhskdpdtujducgoxogjfsouqkhkfplnvoqywnwnonrltolbgzjohdxlwobucbuwghkdulemgryelbclvwkwijlsyrlzocybrqhcfmpovcbmfvfikegaqpdzkpvbfmkezlxpseeisbnwncjlolumwzikksrkxhfkllyureidpmmrtkkvkjbumdnmpxitrlxqlktwrtqdgatdazmqrztrmvknijwormqebfgnfbbncfggmzfvfkzsexmyrxrcvuipjulrmgwvmejztilytfjjyhuutslzhpwasosxqoothdspqinvbjhgrrzbbbmzedhdwfzihznptdggxgflqaiavtctifhlcshebkfajbcdxwngkikdzytddbebzayrphmmobhvvaodgntojbhvaemxzffwqpdmsqjoujbhxjoasbayfpdgjfulvfcrgwslnyqyqdmzfhxvufcotpzdwyhxqsisvonqgsplgsxqogblheybufdwddutmsyfuvfjgyccrfgawhzqejocwjguihzdvyfzeaimvtcdcjqrzcuwzvqrgjrdhjpnfkppprgqvgpivfikpdzkkjkgtusrvujdxltvsrhchzcgdvucnzzyskwdntywzqbwzzarwirgxmokhdixuoqrxhexmsbytnrcfkpxyldalbkqauihsxlcrbqjzzobwsensohnqprzxusmewymtkdfcolfhwxqippmksmlrnlfqlhrenldnjzxqdrtjjygcwqbdhtqicpkqwhmdevlsgmobqosqjmpffoeixbxxrhvrumebtgimhiijhtdrppzhiuhrunmrvzbswlzgvymmgqwihuoflwwhaywajadpfzojkjhdncqtrfpaqqfagvwcntbkdqhzkciwlapkomodmqyxwtquypbbjdefmezkerketzctzdoiislfmleaufovnpabwychebmvxlnkjsfybfuoxsoomxgioiomzauwaspldxwrntkvawlcovclrkfonxdvkazqtzazsanoqwzozlyryyotdxxaiosmfugkrgclmxbvvscmlgbpqmluctdvicyhirqmfvcblaaattivahnrxhhfgxccklbrcbvlbkjwpultvhathockapgjhtrkfrdqrreantgyishlmqmwxubmyxvjdmelwatuqgticskxchgzfueeglpizljgqwdwcowuvmeufsscdgljkobyqikworwzgddwdasgwehoxxcvdxykualubmrzhtwvvrpnburqtuygvzjuypuojbcuaiqidfywduhpuyqfksxzooadifrokqjxmrpqmdmakpbnswdhtfzmxsivqeervgfzyrmyftnoxauluiiecabgmoquqtywzwgkltrgzygxeuphhpgydtyxnobwfornvqitfcwatqjnogpteroweniwnkeehkgnahxaaqsdgvwbltozxewnqblchuacnkpzjxgvaoywrufaseezukagdoabsqmihrctxmcxgstcjsxvdxqzodlfezoegtwzkkoshhxcsfzkzbyclhhjfxzspjfewflnfyspwupkrvwyykgvzhwhabxpdofyaeryazdqfmlipwtlnlfadqnbwfnrqrzceigjrcbubuoonhywhcxajdclvpbnrjcxxbvgyyganyqszugltgonbynqzvqoflqkxwijvdemyobvbmkqctfbpmpcdxpwcmmbupmkefntdldjvrkqukotlebzwyenuajedcgwjrrcqhfktzvlysxbjpauhkjrfkvudtefkdxsaywuhqjbwybfcorchxdcleidjwafrqxlcmcmrxkmpzcazdgdlxyxoebzknsxrdsobttyncpgdxccoxhqmohiwwtqgflnedlavzisporhtbhzizggmwarrckwowcxhzyvjpbvbatduzrudsmezkhzfxchyizgsjwsllmplbtcdtotkzepwsrrddmwvpgwmwhqsnfkyhzmfhymzwhhvqgnixjsqtrxvrdjdbitwxrlnuovbwtqrtnqmauznxhqlsoylhtummzrkopngaelgmjzgsbotpndmimipiozinfxnskmqbuzjhwnmuoxwrngfrplzytzlzmfhvwgvcldmzmauvhhovriwzkixrmshtanxacgryjamqbsfakxynmlylqgirberwaaaaauczpsgscppglpndnnnqdlgospkypvafxiwspkhsobxgvsemqvtmpsluigwmdwqipzrkeyawxxplibsenftdymuavxvnxuutqvzwjbezzgrlpzmpmvjfyudcbqdjhkrmhykjoaiywqvnzrhfihenbwlenwibzldkyrsdqfrcfrlgkbkkscceohmlobydzsphyoitoaoexrdcqjsfkopecyywgazzfftugzykmtymuurwikeoivibpfwtxvekpidkbgrnqkgdwvyofxpnxihgrpahtkwlackzawblhhevosqpodrcxnljqikojnpmhonbogxnvszqlxmrfpjkiwcbsflawkejxnnhtdtzxpnmhdggshhrgapvptobkkogamtdpzeuskdhiyuhkeysxbktqneiqmfksxklqrxfozpakjjmiiqwljdmkgqzgwssqbpjsiqzmumpiynjuwknkdozxicwcdliabidlovhqpkcpjbnwprjnvxxlqzbfcisxxvtltolvslqrgsjqlibhtmlzppcfqriyovojwliqlgyybyrkopnhxfmwtliozuvfjwovqyjhayojbnlkegveqoahwdnpdnaxcbzrnjlqmmlvprejbbjpytaizkjdsalkvsjkxhhohlhkpasgkkdsnvbnwaiwzlaeryuuorxevqwqfevlegfnavetxgykukwoazrjkzimbecpllxuoeonnfcdekzurlphocsqfwhvidekpojgongdguzzkxshfcygxmtwfxvynrgwoursradnecinkuzhctelpyecxsxlqhstgpqfwkbfxsumxcmczkdopgxbbytegpqbimjpwfcyloenxgluiturfokzalymywqdemncrajozxnyrdgyulacxgmmktpagkrpsdmfbvublbwkouexgoclqozuvgzshudfscnlufbclkbkrubjfrbnhpxxnszcyifmsdykbocwocvqoytozfkgwmeiczobuvwrucfjelntebzblroiqsbteocdptimlcjcuwecbfgrbpwnqmasbrtlyeqezyesnszbjnjnvzabwylchplvadoklzwykazdlambaixczmdhteioflodvscdzrwgedapbvjcbdulvlvqulgbbahxlojejzgavpkfviutyklsmfrcjruljtgtvlifosigvsvybmjbcpfcbxybdqpdkmndcjyyefbjnymfuwvwevhqryoqqfcwwkqwnngjcorpqyealbdqiwktlqkwmuhcckaqtqdspcpcuoshjypfvvcjzmcfcanblrbwpacejfefcjlpcbcqyuisngcjmqhueuliyacwpuztjgunhbetupfpetfhmiskwwygwptpsemeebvvrkumzwkbwshptbhudoctvbidokgwdfvfsxsxzoialdhxlivaztakzteqkfncwzzqxixigjpqjxusexlqdcanidqxtvmktzgvzmqpbkygnoifholvuiimnbrmgduttnlqzyjdksmlcodwerzmnwkkaqhafjtuarcyvxwgvnchvqihbwbhhmsrhifspkaoqvkgdnuktbtdytdnqzifkhxoxqeetbiconkkfwmtsyhkegyuuqikntnhcoblfbljmpbgobskezlqicxmvxwgxzskdalreybmwcafktnuuzcvkuqqhohzejqyqalqxngkprtwrocrafpovbnzlgwpvktxrszdspmstqnlicnokqdcoolftqwifelogwwncnmaustpmexrpqqbvssqfkucwfmsbxjpszqjpysnsvmwbdnchrodyzubnwrptbefojsjeehhyifyqnjrpwbfodhjrhytnfpvzwbwhxqzpblgindehlhinkozsupqrbptortjglaimblyizcbgxxoknpdhpjlrpkdntftgw"));
    }
  static   public String removeDuplicates(String s) {

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        String ans="";
        while(!stack.isEmpty())
        {
           if(ans=="")
               ans+=stack.pop();
           
                if(stack.peek()==ans.charAt(0)){
                    stack.pop();
                   ans= ans.substring(1);
                    System.out.println(ans);
                }
                else{
                    ans=stack.pop()+ans;
                System.out.println(ans);
                }
        }
        return ans;
    }
}