//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// ad disapproval reasons
enum AdDisapprovalReasons {
  HASHTAGS._(r'HASHTAGS'),
  PROMOTIONS_AND_PRICES._(r'PROMOTIONS_AND_PRICES'),
  TARGETING._(r'TARGETING'),
  LANDING_PAGE._(r'LANDING_PAGE'),
  CAPS_AND_SYMBOLS._(r'CAPS_AND_SYMBOLS'),
  SHOCKING._(r'SHOCKING'),
  WEIGHT_LOSS._(r'WEIGHT_LOSS'),
  PROHIBITED_PRODUCT._(r'PROHIBITED_PRODUCT'),
  AUTHENTICITY._(r'AUTHENTICITY'),
  NUDITY._(r'NUDITY'),
  CONFUSING_DESIGN._(r'CONFUSING_DESIGN'),
  URGENCY._(r'URGENCY'),
  RATINGS._(r'RATINGS'),
  APP._(r'APP'),
  ALCOHOL._(r'ALCOHOL'),
  CONTESTS._(r'CONTESTS'),
  POLITICAL._(r'POLITICAL'),
  OTHER._(r'OTHER'),
  IMAGE._(r'IMAGE'),
  NAR._(r'NAR'),
  INCONSISTENT._(r'INCONSISTENT'),
  CLICKBAIT._(r'CLICKBAIT'),
  NO_DESCRIPTION._(r'NO_DESCRIPTION'),
  LOW_QUALITY._(r'LOW_QUALITY'),
  EXAGGERATED_CLAIMS._(r'EXAGGERATED_CLAIMS'),
  PINTEREST_BRAND._(r'PINTEREST_BRAND'),
  ALCOHOL_NO_SALE._(r'ALCOHOL_NO_SALE'),
  LANDING_PAGE_SPEED._(r'LANDING_PAGE_SPEED'),
  LANDING_PAGE_HARDWALL._(r'LANDING_PAGE_HARDWALL'),
  LANDING_PAGE_BROKEN._(r'LANDING_PAGE_BROKEN'),
  LANDING_PAGE_QUALITY._(r'LANDING_PAGE_QUALITY'),
  OUT_OF_STOCK._(r'OUT_OF_STOCK'),
  IMAGE_LOW_QUALITY._(r'IMAGE_LOW_QUALITY'),
  IMAGE_BUSY._(r'IMAGE_BUSY'),
  IMAGE_POORLY_EDITED._(r'IMAGE_POORLY_EDITED'),
  IMAGE_BEFORE_AFTER._(r'IMAGE_BEFORE_AFTER'),
  UGC._(r'UGC'),
  FAKE_BUTTONS._(r'FAKE_BUTTONS'),
  WEAPONS._(r'WEAPONS'),
  SENSITIVE._(r'SENSITIVE'),
  UNACCEPTABLE_BUSINESS._(r'UNACCEPTABLE_BUSINESS'),
  SUSPICIOUS_CLAIMS._(r'SUSPICIOUS_CLAIMS'),
  PHARMA._(r'PHARMA'),
  SUSPICIOUS_SUPPLEMENTS._(r'SUSPICIOUS_SUPPLEMENTS'),
  ILLEGAL_RECREATIONAL_DRUG._(r'ILLEGAL_RECREATIONAL_DRUG'),
  LOW_QUALITY_LANDING_PAGE._(r'LOW_QUALITY_LANDING_PAGE'),
  RESTRICTED_HEALTHCARE._(r'RESTRICTED_HEALTHCARE'),
  INCONSISTENT_LANG_FR._(r'INCONSISTENT_LANG_FR'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdDisapprovalReasons._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdDisapprovalReasons] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdDisapprovalReasons? fromJson(dynamic value) => AdDisapprovalReasonsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdDisapprovalReasons]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdDisapprovalReasons> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdDisapprovalReasons>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdDisapprovalReasons.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdDisapprovalReasons] to String,
/// and [decode] dynamic data back to [AdDisapprovalReasons].
class AdDisapprovalReasonsTypeTransformer {
  factory AdDisapprovalReasonsTypeTransformer() => _instance ??= const AdDisapprovalReasonsTypeTransformer._();

  const AdDisapprovalReasonsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdDisapprovalReasons data) => data._value;

  /// Returns the instance of [AdDisapprovalReasons] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdDisapprovalReasons? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdDisapprovalReasons) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HASHTAGS': return AdDisapprovalReasons.HASHTAGS;
        case r'PROMOTIONS_AND_PRICES': return AdDisapprovalReasons.PROMOTIONS_AND_PRICES;
        case r'TARGETING': return AdDisapprovalReasons.TARGETING;
        case r'LANDING_PAGE': return AdDisapprovalReasons.LANDING_PAGE;
        case r'CAPS_AND_SYMBOLS': return AdDisapprovalReasons.CAPS_AND_SYMBOLS;
        case r'SHOCKING': return AdDisapprovalReasons.SHOCKING;
        case r'WEIGHT_LOSS': return AdDisapprovalReasons.WEIGHT_LOSS;
        case r'PROHIBITED_PRODUCT': return AdDisapprovalReasons.PROHIBITED_PRODUCT;
        case r'AUTHENTICITY': return AdDisapprovalReasons.AUTHENTICITY;
        case r'NUDITY': return AdDisapprovalReasons.NUDITY;
        case r'CONFUSING_DESIGN': return AdDisapprovalReasons.CONFUSING_DESIGN;
        case r'URGENCY': return AdDisapprovalReasons.URGENCY;
        case r'RATINGS': return AdDisapprovalReasons.RATINGS;
        case r'APP': return AdDisapprovalReasons.APP;
        case r'ALCOHOL': return AdDisapprovalReasons.ALCOHOL;
        case r'CONTESTS': return AdDisapprovalReasons.CONTESTS;
        case r'POLITICAL': return AdDisapprovalReasons.POLITICAL;
        case r'OTHER': return AdDisapprovalReasons.OTHER;
        case r'IMAGE': return AdDisapprovalReasons.IMAGE;
        case r'NAR': return AdDisapprovalReasons.NAR;
        case r'INCONSISTENT': return AdDisapprovalReasons.INCONSISTENT;
        case r'CLICKBAIT': return AdDisapprovalReasons.CLICKBAIT;
        case r'NO_DESCRIPTION': return AdDisapprovalReasons.NO_DESCRIPTION;
        case r'LOW_QUALITY': return AdDisapprovalReasons.LOW_QUALITY;
        case r'EXAGGERATED_CLAIMS': return AdDisapprovalReasons.EXAGGERATED_CLAIMS;
        case r'PINTEREST_BRAND': return AdDisapprovalReasons.PINTEREST_BRAND;
        case r'ALCOHOL_NO_SALE': return AdDisapprovalReasons.ALCOHOL_NO_SALE;
        case r'LANDING_PAGE_SPEED': return AdDisapprovalReasons.LANDING_PAGE_SPEED;
        case r'LANDING_PAGE_HARDWALL': return AdDisapprovalReasons.LANDING_PAGE_HARDWALL;
        case r'LANDING_PAGE_BROKEN': return AdDisapprovalReasons.LANDING_PAGE_BROKEN;
        case r'LANDING_PAGE_QUALITY': return AdDisapprovalReasons.LANDING_PAGE_QUALITY;
        case r'OUT_OF_STOCK': return AdDisapprovalReasons.OUT_OF_STOCK;
        case r'IMAGE_LOW_QUALITY': return AdDisapprovalReasons.IMAGE_LOW_QUALITY;
        case r'IMAGE_BUSY': return AdDisapprovalReasons.IMAGE_BUSY;
        case r'IMAGE_POORLY_EDITED': return AdDisapprovalReasons.IMAGE_POORLY_EDITED;
        case r'IMAGE_BEFORE_AFTER': return AdDisapprovalReasons.IMAGE_BEFORE_AFTER;
        case r'UGC': return AdDisapprovalReasons.UGC;
        case r'FAKE_BUTTONS': return AdDisapprovalReasons.FAKE_BUTTONS;
        case r'WEAPONS': return AdDisapprovalReasons.WEAPONS;
        case r'SENSITIVE': return AdDisapprovalReasons.SENSITIVE;
        case r'UNACCEPTABLE_BUSINESS': return AdDisapprovalReasons.UNACCEPTABLE_BUSINESS;
        case r'SUSPICIOUS_CLAIMS': return AdDisapprovalReasons.SUSPICIOUS_CLAIMS;
        case r'PHARMA': return AdDisapprovalReasons.PHARMA;
        case r'SUSPICIOUS_SUPPLEMENTS': return AdDisapprovalReasons.SUSPICIOUS_SUPPLEMENTS;
        case r'ILLEGAL_RECREATIONAL_DRUG': return AdDisapprovalReasons.ILLEGAL_RECREATIONAL_DRUG;
        case r'LOW_QUALITY_LANDING_PAGE': return AdDisapprovalReasons.LOW_QUALITY_LANDING_PAGE;
        case r'RESTRICTED_HEALTHCARE': return AdDisapprovalReasons.RESTRICTED_HEALTHCARE;
        case r'INCONSISTENT_LANG_FR': return AdDisapprovalReasons.INCONSISTENT_LANG_FR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdDisapprovalReasonsTypeTransformer? _instance;
}

