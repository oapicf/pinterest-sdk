import { Country } from './country';
import { ItemCreateBatchRecord } from './item-create-batch-record';


/**
 * Request object to create catalogs items
 */
export interface CatalogsItemsCreateBatchRequest { 
  country: Country;
  /**
   * Array with catalogs items
   */
  items: Array<ItemCreateBatchRecord>;
  /**
   * We recommend using the CatalogsLocale values.
   */
  language: CatalogsItemsCreateBatchRequest.LanguageEnum;
  operation: CatalogsItemsCreateBatchRequest.OperationEnum;
}
export namespace CatalogsItemsCreateBatchRequest {
  export const LanguageEnum = {
    AfZa: 'af-ZA',
    ArSa: 'ar-SA',
    BgBg: 'bg-BG',
    BnIn: 'bn-IN',
    CsCz: 'cs-CZ',
    DaDk: 'da-DK',
    De: 'de',
    ElGr: 'el-GR',
    EnAu: 'en-AU',
    EnCa: 'en-CA',
    EnGb: 'en-GB',
    EnIn: 'en-IN',
    EnUs: 'en-US',
    Es419: 'es-419',
    EsAr: 'es-AR',
    EsEs: 'es-ES',
    EsMx: 'es-MX',
    FiFi: 'fi-FI',
    Fr: 'fr',
    FrCa: 'fr-CA',
    HeIl: 'he-IL',
    HiIn: 'hi-IN',
    HrHr: 'hr-HR',
    HuHu: 'hu-HU',
    IdId: 'id-ID',
    It: 'it',
    Ja: 'ja',
    KoKr: 'ko-KR',
    MsMy: 'ms-MY',
    NbNo: 'nb-NO',
    Nl: 'nl',
    PlPl: 'pl-PL',
    PtBr: 'pt-BR',
    PtPt: 'pt-PT',
    RoRo: 'ro-RO',
    RuRu: 'ru-RU',
    SkSk: 'sk-SK',
    SvSe: 'sv-SE',
    TeIn: 'te-IN',
    ThTh: 'th-TH',
    TlPh: 'tl-PH',
    Tr: 'tr',
    UkUa: 'uk-UA',
    ViVn: 'vi-VN',
    ZhCn: 'zh-CN',
    ZhTw: 'zh-TW',
    Am: 'AM',
    Ar: 'AR',
    Az: 'AZ',
    Bg: 'BG',
    Bn: 'BN',
    Bs: 'BS',
    Ca: 'CA',
    Cs: 'CS',
    Da: 'DA',
    Dv: 'DV',
    Dz: 'DZ',
    De2: 'DE',
    El: 'EL',
    En: 'EN',
    Es: 'ES',
    Et: 'ET',
    Fa: 'FA',
    Fi: 'FI',
    Fr2: 'FR',
    He: 'HE',
    Hi: 'HI',
    Hr: 'HR',
    Hu: 'HU',
    Hy: 'HY',
    Id: 'ID',
    In: 'IN',
    Is: 'IS',
    It2: 'IT',
    Iw: 'IW',
    Ja2: 'JA',
    Ka: 'KA',
    Km: 'KM',
    Ko: 'KO',
    Lo: 'LO',
    Lt: 'LT',
    Lv: 'LV',
    Mk: 'MK',
    Mn: 'MN',
    Ms: 'MS',
    My: 'MY',
    Nb: 'NB',
    Ne: 'NE',
    Nl2: 'NL',
    False: 'false',
    Pl: 'PL',
    Pt: 'PT',
    Ro: 'RO',
    Ru: 'RU',
    Sk: 'SK',
    Sl: 'SL',
    Sq: 'SQ',
    Sr: 'SR',
    Sv: 'SV',
    Tl: 'TL',
    Uk: 'UK',
    Vi: 'VI',
    Te: 'TE',
    Th: 'TH',
    Tr2: 'TR',
    Xx: 'XX',
    Zh: 'ZH'
  } as const;
  export type LanguageEnum = typeof LanguageEnum[keyof typeof LanguageEnum];
  export const OperationEnum = {
    Create: 'CREATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


