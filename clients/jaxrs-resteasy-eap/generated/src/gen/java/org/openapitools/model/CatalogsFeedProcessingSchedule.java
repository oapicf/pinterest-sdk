package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsFeedProcessingSchedule   {
  
  private String time;

  /**
   * The timezone considered for the processing schedule time.
   */
  public enum TimezoneEnum {
    AFRICA_ABIDJAN("Africa/Abidjan"),

        AFRICA_ACCRA("Africa/Accra"),

        AFRICA_ALGIERS("Africa/Algiers"),

        AFRICA_BISSAU("Africa/Bissau"),

        AFRICA_CAIRO("Africa/Cairo"),

        AFRICA_CASABLANCA("Africa/Casablanca"),

        AFRICA_CEUTA("Africa/Ceuta"),

        AFRICA_EL_AAIUN("Africa/El_Aaiun"),

        AFRICA_JOHANNESBURG("Africa/Johannesburg"),

        AFRICA_JUBA("Africa/Juba"),

        AFRICA_KHARTOUM("Africa/Khartoum"),

        AFRICA_LAGOS("Africa/Lagos"),

        AFRICA_MAPUTO("Africa/Maputo"),

        AFRICA_MONROVIA("Africa/Monrovia"),

        AFRICA_NAIROBI("Africa/Nairobi"),

        AFRICA_NDJAMENA("Africa/Ndjamena"),

        AFRICA_SAO_TOME("Africa/Sao_Tome"),

        AFRICA_TRIPOLI("Africa/Tripoli"),

        AFRICA_TUNIS("Africa/Tunis"),

        AFRICA_WINDHOEK("Africa/Windhoek"),

        AMERICA_ADAK("America/Adak"),

        AMERICA_ANCHORAGE("America/Anchorage"),

        AMERICA_ARAGUAINA("America/Araguaina"),

        AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),

        AMERICA_ARGENTINA_CATAMARCA("America/Argentina/Catamarca"),

        AMERICA_ARGENTINA_CORDOBA("America/Argentina/Cordoba"),

        AMERICA_ARGENTINA_JUJUY("America/Argentina/Jujuy"),

        AMERICA_ARGENTINA_LA_RIOJA("America/Argentina/La_Rioja"),

        AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),

        AMERICA_ARGENTINA_RIO_GALLEGOS("America/Argentina/Rio_Gallegos"),

        AMERICA_ARGENTINA_SALTA("America/Argentina/Salta"),

        AMERICA_ARGENTINA_SAN_JUAN("America/Argentina/San_Juan"),

        AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),

        AMERICA_ARGENTINA_TUCUMAN("America/Argentina/Tucuman"),

        AMERICA_ARGENTINA_USHUAIA("America/Argentina/Ushuaia"),

        AMERICA_ASUNCION("America/Asuncion"),

        AMERICA_ATIKOKAN("America/Atikokan"),

        AMERICA_BAHIA("America/Bahia"),

        AMERICA_BAHIA_BANDERAS("America/Bahia_Banderas"),

        AMERICA_BARBADOS("America/Barbados"),

        AMERICA_BELEM("America/Belem"),

        AMERICA_BELIZE("America/Belize"),

        AMERICA_BLANC_SABLON("America/Blanc-Sablon"),

        AMERICA_BOA_VISTA("America/Boa_Vista"),

        AMERICA_BOGOTA("America/Bogota"),

        AMERICA_BOISE("America/Boise"),

        AMERICA_CAMBRIDGE_BAY("America/Cambridge_Bay"),

        AMERICA_CAMPO_GRANDE("America/Campo_Grande"),

        AMERICA_CANCUN("America/Cancun"),

        AMERICA_CARACAS("America/Caracas"),

        AMERICA_CAYENNE("America/Cayenne"),

        AMERICA_CHICAGO("America/Chicago"),

        AMERICA_CHIHUAHUA("America/Chihuahua"),

        AMERICA_COSTA_RICA("America/Costa_Rica"),

        AMERICA_CRESTON("America/Creston"),

        AMERICA_CUIABA("America/Cuiaba"),

        AMERICA_CURACAO("America/Curacao"),

        AMERICA_DANMARKSHAVN("America/Danmarkshavn"),

        AMERICA_DAWSON("America/Dawson"),

        AMERICA_DAWSON_CREEK("America/Dawson_Creek"),

        AMERICA_DENVER("America/Denver"),

        AMERICA_DETROIT("America/Detroit"),

        AMERICA_EDMONTON("America/Edmonton"),

        AMERICA_EIRUNEPE("America/Eirunepe"),

        AMERICA_EL_SALVADOR("America/El_Salvador"),

        AMERICA_FORT_NELSON("America/Fort_Nelson"),

        AMERICA_FORTALEZA("America/Fortaleza"),

        AMERICA_GLACE_BAY("America/Glace_Bay"),

        AMERICA_GOOSE_BAY("America/Goose_Bay"),

        AMERICA_GRAND_TURK("America/Grand_Turk"),

        AMERICA_GUATEMALA("America/Guatemala"),

        AMERICA_GUAYAQUIL("America/Guayaquil"),

        AMERICA_GUYANA("America/Guyana"),

        AMERICA_HALIFAX("America/Halifax"),

        AMERICA_HAVANA("America/Havana"),

        AMERICA_HERMOSILLO("America/Hermosillo"),

        AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),

        AMERICA_INDIANA_KNOX("America/Indiana/Knox"),

        AMERICA_INDIANA_MARENGO("America/Indiana/Marengo"),

        AMERICA_INDIANA_PETERSBURG("America/Indiana/Petersburg"),

        AMERICA_INDIANA_TELL_CITY("America/Indiana/Tell_City"),

        AMERICA_INDIANA_VEVAY("America/Indiana/Vevay"),

        AMERICA_INDIANA_VINCENNES("America/Indiana/Vincennes"),

        AMERICA_INDIANA_WINAMAC("America/Indiana/Winamac"),

        AMERICA_INUVIK("America/Inuvik"),

        AMERICA_IQALUIT("America/Iqaluit"),

        AMERICA_JAMAICA("America/Jamaica"),

        AMERICA_JUNEAU("America/Juneau"),

        AMERICA_KENTUCKY_LOUISVILLE("America/Kentucky/Louisville"),

        AMERICA_KENTUCKY_MONTICELLO("America/Kentucky/Monticello"),

        AMERICA_LA_PAZ("America/La_Paz"),

        AMERICA_LIMA("America/Lima"),

        AMERICA_LOS_ANGELES("America/Los_Angeles"),

        AMERICA_MACEIO("America/Maceio"),

        AMERICA_MANAGUA("America/Managua"),

        AMERICA_MANAUS("America/Manaus"),

        AMERICA_MARTINIQUE("America/Martinique"),

        AMERICA_MATAMOROS("America/Matamoros"),

        AMERICA_MAZATLAN("America/Mazatlan"),

        AMERICA_MENOMINEE("America/Menominee"),

        AMERICA_MERIDA("America/Merida"),

        AMERICA_METLAKATLA("America/Metlakatla"),

        AMERICA_MEXICO_CITY("America/Mexico_City"),

        AMERICA_MIQUELON("America/Miquelon"),

        AMERICA_MONCTON("America/Moncton"),

        AMERICA_MONTERREY("America/Monterrey"),

        AMERICA_MONTEVIDEO("America/Montevideo"),

        AMERICA_NASSAU("America/Nassau"),

        AMERICA_NEW_YORK("America/New_York"),

        AMERICA_NIPIGON("America/Nipigon"),

        AMERICA_NOME("America/Nome"),

        AMERICA_NORONHA("America/Noronha"),

        AMERICA_NORTH_DAKOTA_BEULAH("America/North_Dakota/Beulah"),

        AMERICA_NORTH_DAKOTA_CENTER("America/North_Dakota/Center"),

        AMERICA_NORTH_DAKOTA_NEW_SALEM("America/North_Dakota/New_Salem"),

        AMERICA_NUUK("America/Nuuk"),

        AMERICA_OJINAGA("America/Ojinaga"),

        AMERICA_PANAMA("America/Panama"),

        AMERICA_PANGNIRTUNG("America/Pangnirtung"),

        AMERICA_PARAMARIBO("America/Paramaribo"),

        AMERICA_PHOENIX("America/Phoenix"),

        AMERICA_PORT_AU_PRINCE("America/Port-au-Prince"),

        AMERICA_PORT_OF_SPAIN("America/Port_of_Spain"),

        AMERICA_PORTO_VELHO("America/Porto_Velho"),

        AMERICA_PUERTO_RICO("America/Puerto_Rico"),

        AMERICA_PUNTA_ARENAS("America/Punta_Arenas"),

        AMERICA_RAINY_RIVER("America/Rainy_River"),

        AMERICA_RANKIN_INLET("America/Rankin_Inlet"),

        AMERICA_RECIFE("America/Recife"),

        AMERICA_REGINA("America/Regina"),

        AMERICA_RESOLUTE("America/Resolute"),

        AMERICA_RIO_BRANCO("America/Rio_Branco"),

        AMERICA_SANTAREM("America/Santarem"),

        AMERICA_SANTIAGO("America/Santiago"),

        AMERICA_SANTO_DOMINGO("America/Santo_Domingo"),

        AMERICA_SAO_PAULO("America/Sao_Paulo"),

        AMERICA_SCORESBYSUND("America/Scoresbysund"),

        AMERICA_SITKA("America/Sitka"),

        AMERICA_ST_JOHNS("America/St_Johns"),

        AMERICA_SWIFT_CURRENT("America/Swift_Current"),

        AMERICA_TEGUCIGALPA("America/Tegucigalpa"),

        AMERICA_THULE("America/Thule"),

        AMERICA_THUNDER_BAY("America/Thunder_Bay"),

        AMERICA_TIJUANA("America/Tijuana"),

        AMERICA_TORONTO("America/Toronto"),

        AMERICA_VANCOUVER("America/Vancouver"),

        AMERICA_WHITEHORSE("America/Whitehorse"),

        AMERICA_WINNIPEG("America/Winnipeg"),

        AMERICA_YAKUTAT("America/Yakutat"),

        AMERICA_YELLOWKNIFE("America/Yellowknife"),

        ANTARCTICA_CASEY("Antarctica/Casey"),

        ANTARCTICA_DAVIS("Antarctica/Davis"),

        ANTARCTICA_DUMONT_D_URVILLE("Antarctica/DumontDUrville"),

        ANTARCTICA_MACQUARIE("Antarctica/Macquarie"),

        ANTARCTICA_MAWSON("Antarctica/Mawson"),

        ANTARCTICA_PALMER("Antarctica/Palmer"),

        ANTARCTICA_ROTHERA("Antarctica/Rothera"),

        ANTARCTICA_SYOWA("Antarctica/Syowa"),

        ANTARCTICA_TROLL("Antarctica/Troll"),

        ANTARCTICA_VOSTOK("Antarctica/Vostok"),

        ASIA_ALMATY("Asia/Almaty"),

        ASIA_AMMAN("Asia/Amman"),

        ASIA_ANADYR("Asia/Anadyr"),

        ASIA_AQTAU("Asia/Aqtau"),

        ASIA_AQTOBE("Asia/Aqtobe"),

        ASIA_ASHGABAT("Asia/Ashgabat"),

        ASIA_ATYRAU("Asia/Atyrau"),

        ASIA_BAGHDAD("Asia/Baghdad"),

        ASIA_BAKU("Asia/Baku"),

        ASIA_BANGKOK("Asia/Bangkok"),

        ASIA_BARNAUL("Asia/Barnaul"),

        ASIA_BEIRUT("Asia/Beirut"),

        ASIA_BISHKEK("Asia/Bishkek"),

        ASIA_BRUNEI("Asia/Brunei"),

        ASIA_CHITA("Asia/Chita"),

        ASIA_CHOIBALSAN("Asia/Choibalsan"),

        ASIA_COLOMBO("Asia/Colombo"),

        ASIA_DAMASCUS("Asia/Damascus"),

        ASIA_DHAKA("Asia/Dhaka"),

        ASIA_DILI("Asia/Dili"),

        ASIA_DUBAI("Asia/Dubai"),

        ASIA_DUSHANBE("Asia/Dushanbe"),

        ASIA_FAMAGUSTA("Asia/Famagusta"),

        ASIA_GAZA("Asia/Gaza"),

        ASIA_HEBRON("Asia/Hebron"),

        ASIA_HO_CHI_MINH("Asia/Ho_Chi_Minh"),

        ASIA_HONG_KONG("Asia/Hong_Kong"),

        ASIA_HOVD("Asia/Hovd"),

        ASIA_IRKUTSK("Asia/Irkutsk"),

        ASIA_JAKARTA("Asia/Jakarta"),

        ASIA_JAYAPURA("Asia/Jayapura"),

        ASIA_JERUSALEM("Asia/Jerusalem"),

        ASIA_KABUL("Asia/Kabul"),

        ASIA_KAMCHATKA("Asia/Kamchatka"),

        ASIA_KARACHI("Asia/Karachi"),

        ASIA_KATHMANDU("Asia/Kathmandu"),

        ASIA_KHANDYGA("Asia/Khandyga"),

        ASIA_KOLKATA("Asia/Kolkata"),

        ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),

        ASIA_KUALA_LUMPUR("Asia/Kuala_Lumpur"),

        ASIA_KUCHING("Asia/Kuching"),

        ASIA_MACAU("Asia/Macau"),

        ASIA_MAGADAN("Asia/Magadan"),

        ASIA_MAKASSAR("Asia/Makassar"),

        ASIA_MANILA("Asia/Manila"),

        ASIA_NICOSIA("Asia/Nicosia"),

        ASIA_NOVOKUZNETSK("Asia/Novokuznetsk"),

        ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),

        ASIA_OMSK("Asia/Omsk"),

        ASIA_ORAL("Asia/Oral"),

        ASIA_PONTIANAK("Asia/Pontianak"),

        ASIA_PYONGYANG("Asia/Pyongyang"),

        ASIA_QATAR("Asia/Qatar"),

        ASIA_QOSTANAY("Asia/Qostanay"),

        ASIA_QYZYLORDA("Asia/Qyzylorda"),

        ASIA_RIYADH("Asia/Riyadh"),

        ASIA_SAKHALIN("Asia/Sakhalin"),

        ASIA_SAMARKAND("Asia/Samarkand"),

        ASIA_SEOUL("Asia/Seoul"),

        ASIA_SHANGHAI("Asia/Shanghai"),

        ASIA_SINGAPORE("Asia/Singapore"),

        ASIA_SREDNEKOLYMSK("Asia/Srednekolymsk"),

        ASIA_TAIPEI("Asia/Taipei"),

        ASIA_TASHKENT("Asia/Tashkent"),

        ASIA_TBILISI("Asia/Tbilisi"),

        ASIA_TEHRAN("Asia/Tehran"),

        ASIA_THIMPHU("Asia/Thimphu"),

        ASIA_TOKYO("Asia/Tokyo"),

        ASIA_TOMSK("Asia/Tomsk"),

        ASIA_ULAANBAATAR("Asia/Ulaanbaatar"),

        ASIA_URUMQI("Asia/Urumqi"),

        ASIA_UST_NERA("Asia/Ust-Nera"),

        ASIA_VLADIVOSTOK("Asia/Vladivostok"),

        ASIA_YAKUTSK("Asia/Yakutsk"),

        ASIA_YANGON("Asia/Yangon"),

        ASIA_YEKATERINBURG("Asia/Yekaterinburg"),

        ASIA_YEREVAN("Asia/Yerevan"),

        ATLANTIC_AZORES("Atlantic/Azores"),

        ATLANTIC_BERMUDA("Atlantic/Bermuda"),

        ATLANTIC_CANARY("Atlantic/Canary"),

        ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),

        ATLANTIC_FAROE("Atlantic/Faroe"),

        ATLANTIC_MADEIRA("Atlantic/Madeira"),

        ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),

        ATLANTIC_SOUTH_GEORGIA("Atlantic/South_Georgia"),

        ATLANTIC_STANLEY("Atlantic/Stanley"),

        AUSTRALIA_ADELAIDE("Australia/Adelaide"),

        AUSTRALIA_BRISBANE("Australia/Brisbane"),

        AUSTRALIA_BROKEN_HILL("Australia/Broken_Hill"),

        AUSTRALIA_CURRIE("Australia/Currie"),

        AUSTRALIA_DARWIN("Australia/Darwin"),

        AUSTRALIA_EUCLA("Australia/Eucla"),

        AUSTRALIA_HOBART("Australia/Hobart"),

        AUSTRALIA_LINDEMAN("Australia/Lindeman"),

        AUSTRALIA_LORD_HOWE("Australia/Lord_Howe"),

        AUSTRALIA_MELBOURNE("Australia/Melbourne"),

        AUSTRALIA_PERTH("Australia/Perth"),

        AUSTRALIA_SYDNEY("Australia/Sydney"),

        CET("CET"),

        CST6_CDT("CST6CDT"),

        EET("EET"),

        EST("EST"),

        EST5_EDT("EST5EDT"),

        ETC_GMT("Etc/GMT"),

        ETC_GMT_1("Etc/GMT+1"),

        ETC_GMT_10("Etc/GMT+10"),

        ETC_GMT_11("Etc/GMT+11"),

        ETC_GMT_122("Etc/GMT+12"),

        ETC_GMT_2("Etc/GMT+2"),

        ETC_GMT_3("Etc/GMT+3"),

        ETC_GMT_4("Etc/GMT+4"),

        ETC_GMT_5("Etc/GMT+5"),

        ETC_GMT_6("Etc/GMT+6"),

        ETC_GMT_7("Etc/GMT+7"),

        ETC_GMT_8("Etc/GMT+8"),

        ETC_GMT_9("Etc/GMT+9"),

        ETC_GMT_12("Etc/GMT-1"),

        ETC_GMT_102("Etc/GMT-10"),

        ETC_GMT_112("Etc/GMT-11"),

        ETC_GMT_122("Etc/GMT-12"),

        ETC_GMT_13("Etc/GMT-13"),

        ETC_GMT_14("Etc/GMT-14"),

        ETC_GMT_22("Etc/GMT-2"),

        ETC_GMT_32("Etc/GMT-3"),

        ETC_GMT_42("Etc/GMT-4"),

        ETC_GMT_52("Etc/GMT-5"),

        ETC_GMT_62("Etc/GMT-6"),

        ETC_GMT_72("Etc/GMT-7"),

        ETC_GMT_82("Etc/GMT-8"),

        ETC_GMT_92("Etc/GMT-9"),

        ETC_UTC("Etc/UTC"),

        EUROPE_AMSTERDAM("Europe/Amsterdam"),

        EUROPE_ANDORRA("Europe/Andorra"),

        EUROPE_ASTRAKHAN("Europe/Astrakhan"),

        EUROPE_ATHENS("Europe/Athens"),

        EUROPE_BELGRADE("Europe/Belgrade"),

        EUROPE_BERLIN("Europe/Berlin"),

        EUROPE_BRUSSELS("Europe/Brussels"),

        EUROPE_BUCHAREST("Europe/Bucharest"),

        EUROPE_BUDAPEST("Europe/Budapest"),

        EUROPE_CHISINAU("Europe/Chisinau"),

        EUROPE_COPENHAGEN("Europe/Copenhagen"),

        EUROPE_DUBLIN("Europe/Dublin"),

        EUROPE_GIBRALTAR("Europe/Gibraltar"),

        EUROPE_HELSINKI("Europe/Helsinki"),

        EUROPE_ISTANBUL("Europe/Istanbul"),

        EUROPE_KALININGRAD("Europe/Kaliningrad"),

        EUROPE_KIEV("Europe/Kiev"),

        EUROPE_KIROV("Europe/Kirov"),

        EUROPE_LISBON("Europe/Lisbon"),

        EUROPE_LONDON("Europe/London"),

        EUROPE_LUXEMBOURG("Europe/Luxembourg"),

        EUROPE_MADRID("Europe/Madrid"),

        EUROPE_MALTA("Europe/Malta"),

        EUROPE_MINSK("Europe/Minsk"),

        EUROPE_MONACO("Europe/Monaco"),

        EUROPE_MOSCOW("Europe/Moscow"),

        EUROPE_OSLO("Europe/Oslo"),

        EUROPE_PARIS("Europe/Paris"),

        EUROPE_PRAGUE("Europe/Prague"),

        EUROPE_RIGA("Europe/Riga"),

        EUROPE_ROME("Europe/Rome"),

        EUROPE_SAMARA("Europe/Samara"),

        EUROPE_SARATOV("Europe/Saratov"),

        EUROPE_SIMFEROPOL("Europe/Simferopol"),

        EUROPE_SOFIA("Europe/Sofia"),

        EUROPE_STOCKHOLM("Europe/Stockholm"),

        EUROPE_TALLINN("Europe/Tallinn"),

        EUROPE_TIRANE("Europe/Tirane"),

        EUROPE_ULYANOVSK("Europe/Ulyanovsk"),

        EUROPE_UZHGOROD("Europe/Uzhgorod"),

        EUROPE_VIENNA("Europe/Vienna"),

        EUROPE_VILNIUS("Europe/Vilnius"),

        EUROPE_VOLGOGRAD("Europe/Volgograd"),

        EUROPE_WARSAW("Europe/Warsaw"),

        EUROPE_ZAPOROZHYE("Europe/Zaporozhye"),

        EUROPE_ZURICH("Europe/Zurich"),

        HST("HST"),

        INDIAN_CHAGOS("Indian/Chagos"),

        INDIAN_CHRISTMAS("Indian/Christmas"),

        INDIAN_COCOS("Indian/Cocos"),

        INDIAN_KERGUELEN("Indian/Kerguelen"),

        INDIAN_MAHE("Indian/Mahe"),

        INDIAN_MALDIVES("Indian/Maldives"),

        INDIAN_MAURITIUS("Indian/Mauritius"),

        INDIAN_REUNION("Indian/Reunion"),

        MET("MET"),

        MST("MST"),

        MST7_MDT("MST7MDT"),

        PST8_PDT("PST8PDT"),

        PACIFIC_APIA("Pacific/Apia"),

        PACIFIC_AUCKLAND("Pacific/Auckland"),

        PACIFIC_BOUGAINVILLE("Pacific/Bougainville"),

        PACIFIC_CHATHAM("Pacific/Chatham"),

        PACIFIC_CHUUK("Pacific/Chuuk"),

        PACIFIC_EASTER("Pacific/Easter"),

        PACIFIC_EFATE("Pacific/Efate"),

        PACIFIC_ENDERBURY("Pacific/Enderbury"),

        PACIFIC_FAKAOFO("Pacific/Fakaofo"),

        PACIFIC_FIJI("Pacific/Fiji"),

        PACIFIC_FUNAFUTI("Pacific/Funafuti"),

        PACIFIC_GALAPAGOS("Pacific/Galapagos"),

        PACIFIC_GAMBIER("Pacific/Gambier"),

        PACIFIC_GUADALCANAL("Pacific/Guadalcanal"),

        PACIFIC_GUAM("Pacific/Guam"),

        PACIFIC_HONOLULU("Pacific/Honolulu"),

        PACIFIC_KIRITIMATI("Pacific/Kiritimati"),

        PACIFIC_KOSRAE("Pacific/Kosrae"),

        PACIFIC_KWAJALEIN("Pacific/Kwajalein"),

        PACIFIC_MAJURO("Pacific/Majuro"),

        PACIFIC_MARQUESAS("Pacific/Marquesas"),

        PACIFIC_NAURU("Pacific/Nauru"),

        PACIFIC_NIUE("Pacific/Niue"),

        PACIFIC_NORFOLK("Pacific/Norfolk"),

        PACIFIC_NOUMEA("Pacific/Noumea"),

        PACIFIC_PAGO_PAGO("Pacific/Pago_Pago"),

        PACIFIC_PALAU("Pacific/Palau"),

        PACIFIC_PITCAIRN("Pacific/Pitcairn"),

        PACIFIC_POHNPEI("Pacific/Pohnpei"),

        PACIFIC_PORT_MORESBY("Pacific/Port_Moresby"),

        PACIFIC_RAROTONGA("Pacific/Rarotonga"),

        PACIFIC_TAHITI("Pacific/Tahiti"),

        PACIFIC_TARAWA("Pacific/Tarawa"),

        PACIFIC_TONGATAPU("Pacific/Tongatapu"),

        PACIFIC_WAKE("Pacific/Wake"),

        PACIFIC_WALLIS("Pacific/Wallis"),

        WET("WET");
    private String value;

    TimezoneEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TimezoneEnum timezone;

  /**
   * A time in format HH:MM with leading 0 (zero)
   **/
  
  @ApiModelProperty(example = "02:59", required = true, value = "A time in format HH:MM with leading 0 (zero)")
  @JsonProperty("time")
  @NotNull
 @Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   * The timezone considered for the processing schedule time.
   **/
  
  @ApiModelProperty(required = true, value = "The timezone considered for the processing schedule time.")
  @JsonProperty("timezone")
  @NotNull
  public TimezoneEnum getTimezone() {
    return timezone;
  }
  public void setTimezone(TimezoneEnum timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedProcessingSchedule catalogsFeedProcessingSchedule = (CatalogsFeedProcessingSchedule) o;
    return Objects.equals(this.time, catalogsFeedProcessingSchedule.time) &&
        Objects.equals(this.timezone, catalogsFeedProcessingSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, timezone);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

