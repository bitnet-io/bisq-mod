package bisq.desktop.util.validation;

import java.util.Map;

import static java.util.Map.entry;

final class CountryCallingCodes {
    /**
     * Immutable mapping of ISO 3166 alpha-2 country code to national dialing number.
     * <p>
     * In some regions, such as American Samoa ('AS'), there is only one area code, and
     * it is included in the mapping as part of the calling code.
     *
     * @see {@link <a href="https://en.wikipedia.org/wiki/E.164">https://en.wikipedia.org/wiki/E.164</a>}
     * @see {@link <a href="https://en.wikipedia.org/wiki/List_of_country_calling_codes">https://en.wikipedia.org/wiki/List_of_country_calling_codes</a>}
     */
    private final static Map<String, String> CALLING_CODE_MAP = Map.ofEntries(
            entry("AD", "376"),
            entry("AE", "971"),
            entry("AF", "93"),
            entry("AG", "1-268"),
            entry("AI", "1-264"),
            entry("AL", "355"),
            entry("AM", "374"),
            entry("AO", "244"),
            entry("AQ", "672"),
            entry("AR", "54"),
            entry("AS", "1-684"),
            entry("AT", "43"),
            entry("AU", "61"),
            entry("AW", "297"),
            entry("AX", "358"),
            entry("AZ", "994"),
            entry("BA", "387"),
            entry("BB", "1-246"),
            entry("BD", "880"),
            entry("BE", "32"),
            entry("BF", "226"),
            entry("BG", "359"),
            entry("BH", "973"),
            entry("BI", "257"),
            entry("BJ", "229"),
            entry("BL", "590"),
            entry("BM", "1-441"),
            entry("BN", "673"),
            entry("BO", "591"),
            entry("BQ", "599"),
            entry("BR", "55"),
            entry("BS", "1-242"),
            entry("BT", "975"),
            entry("BV", "47"),
            entry("BW", "267"),
            entry("BY", "375"),
            entry("BZ", "501"),
            entry("CA", "1"),
            entry("CC", "61"),
            entry("CD", "243"),
            entry("CF", "236"),
            entry("CG", "242"),
            entry("CH", "41"),
            entry("CI", "225"),
            entry("CK", "682"),
            entry("CL", "56"),
            entry("CM", "237"),
            entry("CN", "86"),
            entry("CO", "57"),
            entry("CR", "506"),
            entry("CU", "53"),
            entry("CV", "238"),
            entry("CW", "599"),
            entry("CX", "61"),
            entry("CY", "357"),
            entry("CZ", "420"),
            entry("DE", "49"),
            entry("DJ", "253"),
            entry("DK", "45"),
            entry("DM", "1-767"),
            entry("DO", "1"), // DO has three area codes 809,829,849; let user define hers.
            entry("DZ", "213"),
            entry("EC", "593"),
            entry("EE", "372"),
            entry("EG", "20"),
            entry("EH", "212"),
            entry("ER", "291"),
            entry("ES", "34"),
            entry("ET", "251"),
            entry("FI", "358"),
            entry("FJ", "679"),
            entry("FK", "500"),
            entry("FM", "691"),
            entry("FO", "298"),
            entry("FR", "33"),
            entry("GA", "241"),
            entry("GB", "44"),
            entry("GD", "1-473"),
            entry("GE", "995"),
            entry("GF", "594"),
            entry("GG", "44"),
            entry("GH", "233"),
            entry("GI", "350"),
            entry("GL", "299"),
            entry("GM", "220"),
            entry("GN", "224"),
            entry("GP", "590"),
            entry("GQ", "240"),
            entry("GR", "30"),
            entry("GS", "500"),
            entry("GT", "502"),
            entry("GU", "1-671"),
            entry("GW", "245"),
            entry("GY", "592"),
            entry("HK", "852"),
            entry("HM", "672"),
            entry("HN", "504"),
            entry("HR", "385"),
            entry("HT", "509"),
            entry("HU", "36"),
            entry("ID", "62"),
            entry("IE", "353"),
            entry("IL", "972"),
            entry("IM", "44"),
            entry("IN", "91"),
            entry("IO", "246"),
            entry("IQ", "964"),
            entry("IR", "98"),
            entry("IS", "354"),
            entry("IT", "39"),
            entry("JE", "44"),
            entry("JM", "1-876"),
            entry("JO", "962"),
            entry("JP", "81"),
            entry("KE", "254"),
            entry("KG", "996"),
            entry("KH", "855"),
            entry("KI", "686"),
            entry("KM", "269"),
            entry("KN", "1-869"),
            entry("KP", "850"),
            entry("KR", "82"),
            entry("KW", "965"),
            entry("KY", "1-345"),
            entry("KZ", "7"),
            entry("LA", "856"),
            entry("LB", "961"),
            entry("LC", "1-758"),
            entry("LI", "423"),
            entry("LK", "94"),
            entry("LR", "231"),
            entry("LS", "266"),
            entry("LT", "370"),
            entry("LU", "352"),
            entry("LV", "371"),
            entry("LY", "218"),
            entry("MA", "212"),
            entry("MC", "377"),
            entry("MD", "373"),
            entry("ME", "382"),
            entry("MF", "590"),
            entry("MG", "261"),
            entry("MH", "692"),
            entry("MK", "389"),
            entry("ML", "223"),
            entry("MM", "95"),
            entry("MN", "976"),
            entry("MO", "853"),
            entry("MP", "1-670"),
            entry("MQ", "596"),
            entry("MR", "222"),
            entry("MS", "1-664"),
            entry("MT", "356"),
            entry("MU", "230"),
            entry("MV", "960"),
            entry("MW", "265"),
            entry("MX", "52"),
            entry("MY", "60"),
            entry("MZ", "258"),
            entry("NA", "264"),
            entry("NC", "687"),
            entry("NE", "227"),
            entry("NF", "672"),
            entry("NG", "234"),
            entry("NI", "505"),
            entry("NL", "31"),
            entry("NO", "47"),
            entry("NP", "977"),
            entry("NR", "674"),
            entry("NU", "683"),
            entry("NZ", "64"),
            entry("OM", "968"),
            entry("PA", "507"),
            entry("PE", "51"),
            entry("PF", "689"),
            entry("PG", "675"),
            entry("PH", "63"),
            entry("PK", "92"),
            entry("PL", "48"),
            entry("PM", "508"),
            entry("PN", "870"),
            entry("PR", "1"),
            entry("PS", "970"),
            entry("PT", "351"),
            entry("PW", "680"),
            entry("PY", "595"),
            entry("QA", "974"),
            entry("RE", "262"),
            entry("RO", "40"),
            entry("RS", "381 p"),
            entry("RU", "7"),
            entry("RW", "250"),
            entry("SA", "966"),
            entry("SB", "677"),
            entry("SC", "248"),
            entry("SD", "249"),
            entry("SE", "46"),
            entry("SG", "65"),
            entry("SH", "290 n"),
            entry("SI", "386"),
            entry("SJ", "47"),
            entry("SK", "421"),
            entry("SL", "232"),
            entry("SM", "378"),
            entry("SN", "221"),
            entry("SO", "252"),
            entry("SR", "597"),
            entry("SS", "211"),
            entry("ST", "239"),
            entry("SV", "503"),
            entry("SX", "1-721"),
            entry("SY", "963"),
            entry("SZ", "268"),
            entry("TC", "1-649"),
            entry("TD", "235"),
            entry("TF", "262"),
            entry("TG", "228"),
            entry("TH", "66"),
            entry("TJ", "992"),
            entry("TK", "690"),
            entry("TL", "670"),
            entry("TM", "993"),
            entry("TN", "216"),
            entry("TO", "676"),
            entry("TR", "90"),
            entry("TT", "1-868"),
            entry("TV", "688"),
            entry("TW", "886"),
            entry("TZ", "255"),
            entry("UA", "380"),
            entry("UG", "256"),
            // entry("UM", null),
            entry("US", "1"),
            entry("UY", "598"),
            entry("UZ", "998"),
            entry("VA", "39-06"),
            entry("VC", "1-784"),
            entry("VE", "58"),
            entry("VG", "1-284"),
            entry("VI", "1-340"),
            entry("VN", "84"),
            entry("VU", "678"),
            entry("WF", "681"),
            entry("WS", "685"),
            entry("YE", "967"),
            entry("YT", "262"),
            entry("ZA", "27"),
            entry("ZM", "260"),
            entry("ZW", "263")
    );

    private static final String normalizedCallingCodeRegex = "[\\-]";

    static String getCallingCode(String isoCountryCode) {
        return CALLING_CODE_MAP.get(isoCountryCode);
    }

    static String getNormalizedCallingCode(String isoCountryCode) {
        return getCallingCode(isoCountryCode).replaceAll(normalizedCallingCodeRegex, "");
    }
}
