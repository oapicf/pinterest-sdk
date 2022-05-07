package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
 **/
@ApiModel(description="Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).")
public class CatalogsFeedProcessingSchedule  {
  
  @ApiModelProperty(example = "02:59", required = true, value = "A time in format HH:MM with leading 0 (zero)")
 /**
   * A time in format HH:MM with leading 0 (zero)
  **/
  private String time;

public enum TimezoneEnum {

AFRICA_ABIDJAN(String.valueOf("Africa/Abidjan")), AFRICA_ACCRA(String.valueOf("Africa/Accra")), AFRICA_ALGIERS(String.valueOf("Africa/Algiers")), AFRICA_BISSAU(String.valueOf("Africa/Bissau")), AFRICA_CAIRO(String.valueOf("Africa/Cairo")), AFRICA_CASABLANCA(String.valueOf("Africa/Casablanca")), AFRICA_CEUTA(String.valueOf("Africa/Ceuta")), AFRICA_EL_AAIUN(String.valueOf("Africa/El_Aaiun")), AFRICA_JOHANNESBURG(String.valueOf("Africa/Johannesburg")), AFRICA_JUBA(String.valueOf("Africa/Juba")), AFRICA_KHARTOUM(String.valueOf("Africa/Khartoum")), AFRICA_LAGOS(String.valueOf("Africa/Lagos")), AFRICA_MAPUTO(String.valueOf("Africa/Maputo")), AFRICA_MONROVIA(String.valueOf("Africa/Monrovia")), AFRICA_NAIROBI(String.valueOf("Africa/Nairobi")), AFRICA_NDJAMENA(String.valueOf("Africa/Ndjamena")), AFRICA_SAO_TOME(String.valueOf("Africa/Sao_Tome")), AFRICA_TRIPOLI(String.valueOf("Africa/Tripoli")), AFRICA_TUNIS(String.valueOf("Africa/Tunis")), AFRICA_WINDHOEK(String.valueOf("Africa/Windhoek")), AMERICA_ADAK(String.valueOf("America/Adak")), AMERICA_ANCHORAGE(String.valueOf("America/Anchorage")), AMERICA_ARAGUAINA(String.valueOf("America/Araguaina")), AMERICA_ARGENTINA_BUENOS_AIRES(String.valueOf("America/Argentina/Buenos_Aires")), AMERICA_ARGENTINA_CATAMARCA(String.valueOf("America/Argentina/Catamarca")), AMERICA_ARGENTINA_CORDOBA(String.valueOf("America/Argentina/Cordoba")), AMERICA_ARGENTINA_JUJUY(String.valueOf("America/Argentina/Jujuy")), AMERICA_ARGENTINA_LA_RIOJA(String.valueOf("America/Argentina/La_Rioja")), AMERICA_ARGENTINA_MENDOZA(String.valueOf("America/Argentina/Mendoza")), AMERICA_ARGENTINA_RIO_GALLEGOS(String.valueOf("America/Argentina/Rio_Gallegos")), AMERICA_ARGENTINA_SALTA(String.valueOf("America/Argentina/Salta")), AMERICA_ARGENTINA_SAN_JUAN(String.valueOf("America/Argentina/San_Juan")), AMERICA_ARGENTINA_SAN_LUIS(String.valueOf("America/Argentina/San_Luis")), AMERICA_ARGENTINA_TUCUMAN(String.valueOf("America/Argentina/Tucuman")), AMERICA_ARGENTINA_USHUAIA(String.valueOf("America/Argentina/Ushuaia")), AMERICA_ASUNCION(String.valueOf("America/Asuncion")), AMERICA_ATIKOKAN(String.valueOf("America/Atikokan")), AMERICA_BAHIA(String.valueOf("America/Bahia")), AMERICA_BAHIA_BANDERAS(String.valueOf("America/Bahia_Banderas")), AMERICA_BARBADOS(String.valueOf("America/Barbados")), AMERICA_BELEM(String.valueOf("America/Belem")), AMERICA_BELIZE(String.valueOf("America/Belize")), AMERICA_BLANC_SABLON(String.valueOf("America/Blanc-Sablon")), AMERICA_BOA_VISTA(String.valueOf("America/Boa_Vista")), AMERICA_BOGOTA(String.valueOf("America/Bogota")), AMERICA_BOISE(String.valueOf("America/Boise")), AMERICA_CAMBRIDGE_BAY(String.valueOf("America/Cambridge_Bay")), AMERICA_CAMPO_GRANDE(String.valueOf("America/Campo_Grande")), AMERICA_CANCUN(String.valueOf("America/Cancun")), AMERICA_CARACAS(String.valueOf("America/Caracas")), AMERICA_CAYENNE(String.valueOf("America/Cayenne")), AMERICA_CHICAGO(String.valueOf("America/Chicago")), AMERICA_CHIHUAHUA(String.valueOf("America/Chihuahua")), AMERICA_COSTA_RICA(String.valueOf("America/Costa_Rica")), AMERICA_CRESTON(String.valueOf("America/Creston")), AMERICA_CUIABA(String.valueOf("America/Cuiaba")), AMERICA_CURACAO(String.valueOf("America/Curacao")), AMERICA_DANMARKSHAVN(String.valueOf("America/Danmarkshavn")), AMERICA_DAWSON(String.valueOf("America/Dawson")), AMERICA_DAWSON_CREEK(String.valueOf("America/Dawson_Creek")), AMERICA_DENVER(String.valueOf("America/Denver")), AMERICA_DETROIT(String.valueOf("America/Detroit")), AMERICA_EDMONTON(String.valueOf("America/Edmonton")), AMERICA_EIRUNEPE(String.valueOf("America/Eirunepe")), AMERICA_EL_SALVADOR(String.valueOf("America/El_Salvador")), AMERICA_FORT_NELSON(String.valueOf("America/Fort_Nelson")), AMERICA_FORTALEZA(String.valueOf("America/Fortaleza")), AMERICA_GLACE_BAY(String.valueOf("America/Glace_Bay")), AMERICA_GOOSE_BAY(String.valueOf("America/Goose_Bay")), AMERICA_GRAND_TURK(String.valueOf("America/Grand_Turk")), AMERICA_GUATEMALA(String.valueOf("America/Guatemala")), AMERICA_GUAYAQUIL(String.valueOf("America/Guayaquil")), AMERICA_GUYANA(String.valueOf("America/Guyana")), AMERICA_HALIFAX(String.valueOf("America/Halifax")), AMERICA_HAVANA(String.valueOf("America/Havana")), AMERICA_HERMOSILLO(String.valueOf("America/Hermosillo")), AMERICA_INDIANA_INDIANAPOLIS(String.valueOf("America/Indiana/Indianapolis")), AMERICA_INDIANA_KNOX(String.valueOf("America/Indiana/Knox")), AMERICA_INDIANA_MARENGO(String.valueOf("America/Indiana/Marengo")), AMERICA_INDIANA_PETERSBURG(String.valueOf("America/Indiana/Petersburg")), AMERICA_INDIANA_TELL_CITY(String.valueOf("America/Indiana/Tell_City")), AMERICA_INDIANA_VEVAY(String.valueOf("America/Indiana/Vevay")), AMERICA_INDIANA_VINCENNES(String.valueOf("America/Indiana/Vincennes")), AMERICA_INDIANA_WINAMAC(String.valueOf("America/Indiana/Winamac")), AMERICA_INUVIK(String.valueOf("America/Inuvik")), AMERICA_IQALUIT(String.valueOf("America/Iqaluit")), AMERICA_JAMAICA(String.valueOf("America/Jamaica")), AMERICA_JUNEAU(String.valueOf("America/Juneau")), AMERICA_KENTUCKY_LOUISVILLE(String.valueOf("America/Kentucky/Louisville")), AMERICA_KENTUCKY_MONTICELLO(String.valueOf("America/Kentucky/Monticello")), AMERICA_LA_PAZ(String.valueOf("America/La_Paz")), AMERICA_LIMA(String.valueOf("America/Lima")), AMERICA_LOS_ANGELES(String.valueOf("America/Los_Angeles")), AMERICA_MACEIO(String.valueOf("America/Maceio")), AMERICA_MANAGUA(String.valueOf("America/Managua")), AMERICA_MANAUS(String.valueOf("America/Manaus")), AMERICA_MARTINIQUE(String.valueOf("America/Martinique")), AMERICA_MATAMOROS(String.valueOf("America/Matamoros")), AMERICA_MAZATLAN(String.valueOf("America/Mazatlan")), AMERICA_MENOMINEE(String.valueOf("America/Menominee")), AMERICA_MERIDA(String.valueOf("America/Merida")), AMERICA_METLAKATLA(String.valueOf("America/Metlakatla")), AMERICA_MEXICO_CITY(String.valueOf("America/Mexico_City")), AMERICA_MIQUELON(String.valueOf("America/Miquelon")), AMERICA_MONCTON(String.valueOf("America/Moncton")), AMERICA_MONTERREY(String.valueOf("America/Monterrey")), AMERICA_MONTEVIDEO(String.valueOf("America/Montevideo")), AMERICA_NASSAU(String.valueOf("America/Nassau")), AMERICA_NEW_YORK(String.valueOf("America/New_York")), AMERICA_NIPIGON(String.valueOf("America/Nipigon")), AMERICA_NOME(String.valueOf("America/Nome")), AMERICA_NORONHA(String.valueOf("America/Noronha")), AMERICA_NORTH_DAKOTA_BEULAH(String.valueOf("America/North_Dakota/Beulah")), AMERICA_NORTH_DAKOTA_CENTER(String.valueOf("America/North_Dakota/Center")), AMERICA_NORTH_DAKOTA_NEW_SALEM(String.valueOf("America/North_Dakota/New_Salem")), AMERICA_NUUK(String.valueOf("America/Nuuk")), AMERICA_OJINAGA(String.valueOf("America/Ojinaga")), AMERICA_PANAMA(String.valueOf("America/Panama")), AMERICA_PANGNIRTUNG(String.valueOf("America/Pangnirtung")), AMERICA_PARAMARIBO(String.valueOf("America/Paramaribo")), AMERICA_PHOENIX(String.valueOf("America/Phoenix")), AMERICA_PORT_AU_PRINCE(String.valueOf("America/Port-au-Prince")), AMERICA_PORT_OF_SPAIN(String.valueOf("America/Port_of_Spain")), AMERICA_PORTO_VELHO(String.valueOf("America/Porto_Velho")), AMERICA_PUERTO_RICO(String.valueOf("America/Puerto_Rico")), AMERICA_PUNTA_ARENAS(String.valueOf("America/Punta_Arenas")), AMERICA_RAINY_RIVER(String.valueOf("America/Rainy_River")), AMERICA_RANKIN_INLET(String.valueOf("America/Rankin_Inlet")), AMERICA_RECIFE(String.valueOf("America/Recife")), AMERICA_REGINA(String.valueOf("America/Regina")), AMERICA_RESOLUTE(String.valueOf("America/Resolute")), AMERICA_RIO_BRANCO(String.valueOf("America/Rio_Branco")), AMERICA_SANTAREM(String.valueOf("America/Santarem")), AMERICA_SANTIAGO(String.valueOf("America/Santiago")), AMERICA_SANTO_DOMINGO(String.valueOf("America/Santo_Domingo")), AMERICA_SAO_PAULO(String.valueOf("America/Sao_Paulo")), AMERICA_SCORESBYSUND(String.valueOf("America/Scoresbysund")), AMERICA_SITKA(String.valueOf("America/Sitka")), AMERICA_ST_JOHNS(String.valueOf("America/St_Johns")), AMERICA_SWIFT_CURRENT(String.valueOf("America/Swift_Current")), AMERICA_TEGUCIGALPA(String.valueOf("America/Tegucigalpa")), AMERICA_THULE(String.valueOf("America/Thule")), AMERICA_THUNDER_BAY(String.valueOf("America/Thunder_Bay")), AMERICA_TIJUANA(String.valueOf("America/Tijuana")), AMERICA_TORONTO(String.valueOf("America/Toronto")), AMERICA_VANCOUVER(String.valueOf("America/Vancouver")), AMERICA_WHITEHORSE(String.valueOf("America/Whitehorse")), AMERICA_WINNIPEG(String.valueOf("America/Winnipeg")), AMERICA_YAKUTAT(String.valueOf("America/Yakutat")), AMERICA_YELLOWKNIFE(String.valueOf("America/Yellowknife")), ANTARCTICA_CASEY(String.valueOf("Antarctica/Casey")), ANTARCTICA_DAVIS(String.valueOf("Antarctica/Davis")), ANTARCTICA_DUMONTDURVILLE(String.valueOf("Antarctica/DumontDUrville")), ANTARCTICA_MACQUARIE(String.valueOf("Antarctica/Macquarie")), ANTARCTICA_MAWSON(String.valueOf("Antarctica/Mawson")), ANTARCTICA_PALMER(String.valueOf("Antarctica/Palmer")), ANTARCTICA_ROTHERA(String.valueOf("Antarctica/Rothera")), ANTARCTICA_SYOWA(String.valueOf("Antarctica/Syowa")), ANTARCTICA_TROLL(String.valueOf("Antarctica/Troll")), ANTARCTICA_VOSTOK(String.valueOf("Antarctica/Vostok")), ASIA_ALMATY(String.valueOf("Asia/Almaty")), ASIA_AMMAN(String.valueOf("Asia/Amman")), ASIA_ANADYR(String.valueOf("Asia/Anadyr")), ASIA_AQTAU(String.valueOf("Asia/Aqtau")), ASIA_AQTOBE(String.valueOf("Asia/Aqtobe")), ASIA_ASHGABAT(String.valueOf("Asia/Ashgabat")), ASIA_ATYRAU(String.valueOf("Asia/Atyrau")), ASIA_BAGHDAD(String.valueOf("Asia/Baghdad")), ASIA_BAKU(String.valueOf("Asia/Baku")), ASIA_BANGKOK(String.valueOf("Asia/Bangkok")), ASIA_BARNAUL(String.valueOf("Asia/Barnaul")), ASIA_BEIRUT(String.valueOf("Asia/Beirut")), ASIA_BISHKEK(String.valueOf("Asia/Bishkek")), ASIA_BRUNEI(String.valueOf("Asia/Brunei")), ASIA_CHITA(String.valueOf("Asia/Chita")), ASIA_CHOIBALSAN(String.valueOf("Asia/Choibalsan")), ASIA_COLOMBO(String.valueOf("Asia/Colombo")), ASIA_DAMASCUS(String.valueOf("Asia/Damascus")), ASIA_DHAKA(String.valueOf("Asia/Dhaka")), ASIA_DILI(String.valueOf("Asia/Dili")), ASIA_DUBAI(String.valueOf("Asia/Dubai")), ASIA_DUSHANBE(String.valueOf("Asia/Dushanbe")), ASIA_FAMAGUSTA(String.valueOf("Asia/Famagusta")), ASIA_GAZA(String.valueOf("Asia/Gaza")), ASIA_HEBRON(String.valueOf("Asia/Hebron")), ASIA_HO_CHI_MINH(String.valueOf("Asia/Ho_Chi_Minh")), ASIA_HONG_KONG(String.valueOf("Asia/Hong_Kong")), ASIA_HOVD(String.valueOf("Asia/Hovd")), ASIA_IRKUTSK(String.valueOf("Asia/Irkutsk")), ASIA_JAKARTA(String.valueOf("Asia/Jakarta")), ASIA_JAYAPURA(String.valueOf("Asia/Jayapura")), ASIA_JERUSALEM(String.valueOf("Asia/Jerusalem")), ASIA_KABUL(String.valueOf("Asia/Kabul")), ASIA_KAMCHATKA(String.valueOf("Asia/Kamchatka")), ASIA_KARACHI(String.valueOf("Asia/Karachi")), ASIA_KATHMANDU(String.valueOf("Asia/Kathmandu")), ASIA_KHANDYGA(String.valueOf("Asia/Khandyga")), ASIA_KOLKATA(String.valueOf("Asia/Kolkata")), ASIA_KRASNOYARSK(String.valueOf("Asia/Krasnoyarsk")), ASIA_KUALA_LUMPUR(String.valueOf("Asia/Kuala_Lumpur")), ASIA_KUCHING(String.valueOf("Asia/Kuching")), ASIA_MACAU(String.valueOf("Asia/Macau")), ASIA_MAGADAN(String.valueOf("Asia/Magadan")), ASIA_MAKASSAR(String.valueOf("Asia/Makassar")), ASIA_MANILA(String.valueOf("Asia/Manila")), ASIA_NICOSIA(String.valueOf("Asia/Nicosia")), ASIA_NOVOKUZNETSK(String.valueOf("Asia/Novokuznetsk")), ASIA_NOVOSIBIRSK(String.valueOf("Asia/Novosibirsk")), ASIA_OMSK(String.valueOf("Asia/Omsk")), ASIA_ORAL(String.valueOf("Asia/Oral")), ASIA_PONTIANAK(String.valueOf("Asia/Pontianak")), ASIA_PYONGYANG(String.valueOf("Asia/Pyongyang")), ASIA_QATAR(String.valueOf("Asia/Qatar")), ASIA_QOSTANAY(String.valueOf("Asia/Qostanay")), ASIA_QYZYLORDA(String.valueOf("Asia/Qyzylorda")), ASIA_RIYADH(String.valueOf("Asia/Riyadh")), ASIA_SAKHALIN(String.valueOf("Asia/Sakhalin")), ASIA_SAMARKAND(String.valueOf("Asia/Samarkand")), ASIA_SEOUL(String.valueOf("Asia/Seoul")), ASIA_SHANGHAI(String.valueOf("Asia/Shanghai")), ASIA_SINGAPORE(String.valueOf("Asia/Singapore")), ASIA_SREDNEKOLYMSK(String.valueOf("Asia/Srednekolymsk")), ASIA_TAIPEI(String.valueOf("Asia/Taipei")), ASIA_TASHKENT(String.valueOf("Asia/Tashkent")), ASIA_TBILISI(String.valueOf("Asia/Tbilisi")), ASIA_TEHRAN(String.valueOf("Asia/Tehran")), ASIA_THIMPHU(String.valueOf("Asia/Thimphu")), ASIA_TOKYO(String.valueOf("Asia/Tokyo")), ASIA_TOMSK(String.valueOf("Asia/Tomsk")), ASIA_ULAANBAATAR(String.valueOf("Asia/Ulaanbaatar")), ASIA_URUMQI(String.valueOf("Asia/Urumqi")), ASIA_UST_NERA(String.valueOf("Asia/Ust-Nera")), ASIA_VLADIVOSTOK(String.valueOf("Asia/Vladivostok")), ASIA_YAKUTSK(String.valueOf("Asia/Yakutsk")), ASIA_YANGON(String.valueOf("Asia/Yangon")), ASIA_YEKATERINBURG(String.valueOf("Asia/Yekaterinburg")), ASIA_YEREVAN(String.valueOf("Asia/Yerevan")), ATLANTIC_AZORES(String.valueOf("Atlantic/Azores")), ATLANTIC_BERMUDA(String.valueOf("Atlantic/Bermuda")), ATLANTIC_CANARY(String.valueOf("Atlantic/Canary")), ATLANTIC_CAPE_VERDE(String.valueOf("Atlantic/Cape_Verde")), ATLANTIC_FAROE(String.valueOf("Atlantic/Faroe")), ATLANTIC_MADEIRA(String.valueOf("Atlantic/Madeira")), ATLANTIC_REYKJAVIK(String.valueOf("Atlantic/Reykjavik")), ATLANTIC_SOUTH_GEORGIA(String.valueOf("Atlantic/South_Georgia")), ATLANTIC_STANLEY(String.valueOf("Atlantic/Stanley")), AUSTRALIA_ADELAIDE(String.valueOf("Australia/Adelaide")), AUSTRALIA_BRISBANE(String.valueOf("Australia/Brisbane")), AUSTRALIA_BROKEN_HILL(String.valueOf("Australia/Broken_Hill")), AUSTRALIA_CURRIE(String.valueOf("Australia/Currie")), AUSTRALIA_DARWIN(String.valueOf("Australia/Darwin")), AUSTRALIA_EUCLA(String.valueOf("Australia/Eucla")), AUSTRALIA_HOBART(String.valueOf("Australia/Hobart")), AUSTRALIA_LINDEMAN(String.valueOf("Australia/Lindeman")), AUSTRALIA_LORD_HOWE(String.valueOf("Australia/Lord_Howe")), AUSTRALIA_MELBOURNE(String.valueOf("Australia/Melbourne")), AUSTRALIA_PERTH(String.valueOf("Australia/Perth")), AUSTRALIA_SYDNEY(String.valueOf("Australia/Sydney")), CET(String.valueOf("CET")), CST6CDT(String.valueOf("CST6CDT")), EET(String.valueOf("EET")), EST(String.valueOf("EST")), EST5EDT(String.valueOf("EST5EDT")), ETC_GMT(String.valueOf("Etc/GMT")), ETC_GMT_1(String.valueOf("Etc/GMT+1")), ETC_GMT_10(String.valueOf("Etc/GMT+10")), ETC_GMT_11(String.valueOf("Etc/GMT+11")), ETC_GMT_12(String.valueOf("Etc/GMT+12")), ETC_GMT_2(String.valueOf("Etc/GMT+2")), ETC_GMT_3(String.valueOf("Etc/GMT+3")), ETC_GMT_4(String.valueOf("Etc/GMT+4")), ETC_GMT_5(String.valueOf("Etc/GMT+5")), ETC_GMT_6(String.valueOf("Etc/GMT+6")), ETC_GMT_7(String.valueOf("Etc/GMT+7")), ETC_GMT_8(String.valueOf("Etc/GMT+8")), ETC_GMT_9(String.valueOf("Etc/GMT+9")), ETC_GMT_1(String.valueOf("Etc/GMT-1")), ETC_GMT_10(String.valueOf("Etc/GMT-10")), ETC_GMT_11(String.valueOf("Etc/GMT-11")), ETC_GMT_12(String.valueOf("Etc/GMT-12")), ETC_GMT_13(String.valueOf("Etc/GMT-13")), ETC_GMT_14(String.valueOf("Etc/GMT-14")), ETC_GMT_2(String.valueOf("Etc/GMT-2")), ETC_GMT_3(String.valueOf("Etc/GMT-3")), ETC_GMT_4(String.valueOf("Etc/GMT-4")), ETC_GMT_5(String.valueOf("Etc/GMT-5")), ETC_GMT_6(String.valueOf("Etc/GMT-6")), ETC_GMT_7(String.valueOf("Etc/GMT-7")), ETC_GMT_8(String.valueOf("Etc/GMT-8")), ETC_GMT_9(String.valueOf("Etc/GMT-9")), ETC_UTC(String.valueOf("Etc/UTC")), EUROPE_AMSTERDAM(String.valueOf("Europe/Amsterdam")), EUROPE_ANDORRA(String.valueOf("Europe/Andorra")), EUROPE_ASTRAKHAN(String.valueOf("Europe/Astrakhan")), EUROPE_ATHENS(String.valueOf("Europe/Athens")), EUROPE_BELGRADE(String.valueOf("Europe/Belgrade")), EUROPE_BERLIN(String.valueOf("Europe/Berlin")), EUROPE_BRUSSELS(String.valueOf("Europe/Brussels")), EUROPE_BUCHAREST(String.valueOf("Europe/Bucharest")), EUROPE_BUDAPEST(String.valueOf("Europe/Budapest")), EUROPE_CHISINAU(String.valueOf("Europe/Chisinau")), EUROPE_COPENHAGEN(String.valueOf("Europe/Copenhagen")), EUROPE_DUBLIN(String.valueOf("Europe/Dublin")), EUROPE_GIBRALTAR(String.valueOf("Europe/Gibraltar")), EUROPE_HELSINKI(String.valueOf("Europe/Helsinki")), EUROPE_ISTANBUL(String.valueOf("Europe/Istanbul")), EUROPE_KALININGRAD(String.valueOf("Europe/Kaliningrad")), EUROPE_KIEV(String.valueOf("Europe/Kiev")), EUROPE_KIROV(String.valueOf("Europe/Kirov")), EUROPE_LISBON(String.valueOf("Europe/Lisbon")), EUROPE_LONDON(String.valueOf("Europe/London")), EUROPE_LUXEMBOURG(String.valueOf("Europe/Luxembourg")), EUROPE_MADRID(String.valueOf("Europe/Madrid")), EUROPE_MALTA(String.valueOf("Europe/Malta")), EUROPE_MINSK(String.valueOf("Europe/Minsk")), EUROPE_MONACO(String.valueOf("Europe/Monaco")), EUROPE_MOSCOW(String.valueOf("Europe/Moscow")), EUROPE_OSLO(String.valueOf("Europe/Oslo")), EUROPE_PARIS(String.valueOf("Europe/Paris")), EUROPE_PRAGUE(String.valueOf("Europe/Prague")), EUROPE_RIGA(String.valueOf("Europe/Riga")), EUROPE_ROME(String.valueOf("Europe/Rome")), EUROPE_SAMARA(String.valueOf("Europe/Samara")), EUROPE_SARATOV(String.valueOf("Europe/Saratov")), EUROPE_SIMFEROPOL(String.valueOf("Europe/Simferopol")), EUROPE_SOFIA(String.valueOf("Europe/Sofia")), EUROPE_STOCKHOLM(String.valueOf("Europe/Stockholm")), EUROPE_TALLINN(String.valueOf("Europe/Tallinn")), EUROPE_TIRANE(String.valueOf("Europe/Tirane")), EUROPE_ULYANOVSK(String.valueOf("Europe/Ulyanovsk")), EUROPE_UZHGOROD(String.valueOf("Europe/Uzhgorod")), EUROPE_VIENNA(String.valueOf("Europe/Vienna")), EUROPE_VILNIUS(String.valueOf("Europe/Vilnius")), EUROPE_VOLGOGRAD(String.valueOf("Europe/Volgograd")), EUROPE_WARSAW(String.valueOf("Europe/Warsaw")), EUROPE_ZAPOROZHYE(String.valueOf("Europe/Zaporozhye")), EUROPE_ZURICH(String.valueOf("Europe/Zurich")), HST(String.valueOf("HST")), INDIAN_CHAGOS(String.valueOf("Indian/Chagos")), INDIAN_CHRISTMAS(String.valueOf("Indian/Christmas")), INDIAN_COCOS(String.valueOf("Indian/Cocos")), INDIAN_KERGUELEN(String.valueOf("Indian/Kerguelen")), INDIAN_MAHE(String.valueOf("Indian/Mahe")), INDIAN_MALDIVES(String.valueOf("Indian/Maldives")), INDIAN_MAURITIUS(String.valueOf("Indian/Mauritius")), INDIAN_REUNION(String.valueOf("Indian/Reunion")), MET(String.valueOf("MET")), MST(String.valueOf("MST")), MST7MDT(String.valueOf("MST7MDT")), PST8PDT(String.valueOf("PST8PDT")), PACIFIC_APIA(String.valueOf("Pacific/Apia")), PACIFIC_AUCKLAND(String.valueOf("Pacific/Auckland")), PACIFIC_BOUGAINVILLE(String.valueOf("Pacific/Bougainville")), PACIFIC_CHATHAM(String.valueOf("Pacific/Chatham")), PACIFIC_CHUUK(String.valueOf("Pacific/Chuuk")), PACIFIC_EASTER(String.valueOf("Pacific/Easter")), PACIFIC_EFATE(String.valueOf("Pacific/Efate")), PACIFIC_ENDERBURY(String.valueOf("Pacific/Enderbury")), PACIFIC_FAKAOFO(String.valueOf("Pacific/Fakaofo")), PACIFIC_FIJI(String.valueOf("Pacific/Fiji")), PACIFIC_FUNAFUTI(String.valueOf("Pacific/Funafuti")), PACIFIC_GALAPAGOS(String.valueOf("Pacific/Galapagos")), PACIFIC_GAMBIER(String.valueOf("Pacific/Gambier")), PACIFIC_GUADALCANAL(String.valueOf("Pacific/Guadalcanal")), PACIFIC_GUAM(String.valueOf("Pacific/Guam")), PACIFIC_HONOLULU(String.valueOf("Pacific/Honolulu")), PACIFIC_KIRITIMATI(String.valueOf("Pacific/Kiritimati")), PACIFIC_KOSRAE(String.valueOf("Pacific/Kosrae")), PACIFIC_KWAJALEIN(String.valueOf("Pacific/Kwajalein")), PACIFIC_MAJURO(String.valueOf("Pacific/Majuro")), PACIFIC_MARQUESAS(String.valueOf("Pacific/Marquesas")), PACIFIC_NAURU(String.valueOf("Pacific/Nauru")), PACIFIC_NIUE(String.valueOf("Pacific/Niue")), PACIFIC_NORFOLK(String.valueOf("Pacific/Norfolk")), PACIFIC_NOUMEA(String.valueOf("Pacific/Noumea")), PACIFIC_PAGO_PAGO(String.valueOf("Pacific/Pago_Pago")), PACIFIC_PALAU(String.valueOf("Pacific/Palau")), PACIFIC_PITCAIRN(String.valueOf("Pacific/Pitcairn")), PACIFIC_POHNPEI(String.valueOf("Pacific/Pohnpei")), PACIFIC_PORT_MORESBY(String.valueOf("Pacific/Port_Moresby")), PACIFIC_RAROTONGA(String.valueOf("Pacific/Rarotonga")), PACIFIC_TAHITI(String.valueOf("Pacific/Tahiti")), PACIFIC_TARAWA(String.valueOf("Pacific/Tarawa")), PACIFIC_TONGATAPU(String.valueOf("Pacific/Tongatapu")), PACIFIC_WAKE(String.valueOf("Pacific/Wake")), PACIFIC_WALLIS(String.valueOf("Pacific/Wallis")), WET(String.valueOf("WET")), NULL(String.valueOf("null"));


    private String value;

    TimezoneEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimezoneEnum fromValue(String value) {
        for (TimezoneEnum b : TimezoneEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The timezone considered for the processing schedule time.")
 /**
   * The timezone considered for the processing schedule time.
  **/
  private TimezoneEnum timezone;
 /**
   * A time in format HH:MM with leading 0 (zero)
   * @return time
  **/
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public CatalogsFeedProcessingSchedule time(String time) {
    this.time = time;
    return this;
  }

 /**
   * The timezone considered for the processing schedule time.
   * @return timezone
  **/
  @JsonProperty("timezone")
  public String getTimezone() {
    if (timezone == null) {
      return null;
    }
    return timezone.value();
  }

  public void setTimezone(TimezoneEnum timezone) {
    this.timezone = timezone;
  }

  public CatalogsFeedProcessingSchedule timezone(TimezoneEnum timezone) {
    this.timezone = timezone;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProcessingSchedule {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

