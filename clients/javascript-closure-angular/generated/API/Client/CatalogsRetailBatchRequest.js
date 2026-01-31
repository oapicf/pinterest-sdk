goog.provide('API.Client.CatalogsRetailBatchRequest');

/**
 * A request object that can have multiple operations on a single retail batch
 * @record
 */
API.Client.CatalogsRetailBatchRequest = function() {}

/**
 * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.country;

/**
 * Array with catalogs item operations
 * @type {!Array<!API.Client.CatalogsRetailBatchRequest_items_inner>}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.items;

/**
 * We recommend using the CatalogsLocale values.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.language;

/** @enum {string} */
API.Client.CatalogsRetailBatchRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
/** @enum {string} */
API.Client.CatalogsRetailBatchRequest.LanguageEnum = { 
  af-ZA: 'af-ZA',
  ar-SA: 'ar-SA',
  bg-BG: 'bg-BG',
  bn-IN: 'bn-IN',
  cs-CZ: 'cs-CZ',
  da-DK: 'da-DK',
  de: 'de',
  el-GR: 'el-GR',
  en-AU: 'en-AU',
  en-CA: 'en-CA',
  en-GB: 'en-GB',
  en-IN: 'en-IN',
  en-US: 'en-US',
  es-419: 'es-419',
  es-AR: 'es-AR',
  es-ES: 'es-ES',
  es-MX: 'es-MX',
  fi-FI: 'fi-FI',
  fr: 'fr',
  fr-CA: 'fr-CA',
  he-IL: 'he-IL',
  hi-IN: 'hi-IN',
  hr-HR: 'hr-HR',
  hu-HU: 'hu-HU',
  id-ID: 'id-ID',
  it: 'it',
  ja: 'ja',
  ko-KR: 'ko-KR',
  ms-MY: 'ms-MY',
  nb-NO: 'nb-NO',
  nl: 'nl',
  pl-PL: 'pl-PL',
  pt-BR: 'pt-BR',
  pt-PT: 'pt-PT',
  ro-RO: 'ro-RO',
  ru-RU: 'ru-RU',
  sk-SK: 'sk-SK',
  sv-SE: 'sv-SE',
  te-IN: 'te-IN',
  th-TH: 'th-TH',
  tl-PH: 'tl-PH',
  tr: 'tr',
  uk-UA: 'uk-UA',
  vi-VN: 'vi-VN',
  zh-CN: 'zh-CN',
  zh-TW: 'zh-TW',
  AM: 'AM',
  AR: 'AR',
  AZ: 'AZ',
  BG: 'BG',
  BN: 'BN',
  BS: 'BS',
  CA: 'CA',
  CS: 'CS',
  DA: 'DA',
  DV: 'DV',
  DZ: 'DZ',
  DE: 'DE',
  EL: 'EL',
  EN: 'EN',
  ES: 'ES',
  ET: 'ET',
  FA: 'FA',
  FI: 'FI',
  FR: 'FR',
  HE: 'HE',
  HI: 'HI',
  HR: 'HR',
  HU: 'HU',
  HY: 'HY',
  ID: 'ID',
  IN: 'IN',
  IS: 'IS',
  IT: 'IT',
  IW: 'IW',
  JA: 'JA',
  KA: 'KA',
  KM: 'KM',
  KO: 'KO',
  LO: 'LO',
  LT: 'LT',
  LV: 'LV',
  MK: 'MK',
  MN: 'MN',
  MS: 'MS',
  MY: 'MY',
  NB: 'NB',
  NE: 'NE',
  NL: 'NL',
  NO: 'NO',
  PL: 'PL',
  PT: 'PT',
  RO: 'RO',
  RU: 'RU',
  SK: 'SK',
  SL: 'SL',
  SQ: 'SQ',
  SR: 'SR',
  SV: 'SV',
  TL: 'TL',
  UK: 'UK',
  VI: 'VI',
  TE: 'TE',
  TH: 'TH',
  TR: 'TR',
  XX: 'XX',
  ZH: 'ZH',
}
