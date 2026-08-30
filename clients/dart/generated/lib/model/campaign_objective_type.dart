//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
enum CampaignObjectiveType {
  AWARENESS._(r'AWARENESS'),
  CONSIDERATION._(r'CONSIDERATION'),
  VIDEO_VIEW._(r'VIDEO_VIEW'),
  WEB_CONVERSION._(r'WEB_CONVERSION'),
  CATALOG_SALES._(r'CATALOG_SALES'),
  WEB_SESSIONS._(r'WEB_SESSIONS'),
  VIDEO_COMPLETION._(r'VIDEO_COMPLETION'),
  APP_INSTALL._(r'APP_INSTALL'),
  SALES._(r'SALES'),
  LEADS._(r'LEADS'),
  CTV_CONSIDERATION._(r'CTV_CONSIDERATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignObjectiveType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignObjectiveType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignObjectiveType? fromJson(dynamic value) => CampaignObjectiveTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignObjectiveType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignObjectiveType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignObjectiveType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignObjectiveType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignObjectiveType] to String,
/// and [decode] dynamic data back to [CampaignObjectiveType].
class CampaignObjectiveTypeTypeTransformer {
  factory CampaignObjectiveTypeTypeTransformer() => _instance ??= const CampaignObjectiveTypeTypeTransformer._();

  const CampaignObjectiveTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignObjectiveType data) => data._value;

  /// Returns the instance of [CampaignObjectiveType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignObjectiveType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignObjectiveType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AWARENESS': return CampaignObjectiveType.AWARENESS;
        case r'CONSIDERATION': return CampaignObjectiveType.CONSIDERATION;
        case r'VIDEO_VIEW': return CampaignObjectiveType.VIDEO_VIEW;
        case r'WEB_CONVERSION': return CampaignObjectiveType.WEB_CONVERSION;
        case r'CATALOG_SALES': return CampaignObjectiveType.CATALOG_SALES;
        case r'WEB_SESSIONS': return CampaignObjectiveType.WEB_SESSIONS;
        case r'VIDEO_COMPLETION': return CampaignObjectiveType.VIDEO_COMPLETION;
        case r'APP_INSTALL': return CampaignObjectiveType.APP_INSTALL;
        case r'SALES': return CampaignObjectiveType.SALES;
        case r'LEADS': return CampaignObjectiveType.LEADS;
        case r'CTV_CONSIDERATION': return CampaignObjectiveType.CTV_CONSIDERATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignObjectiveTypeTypeTransformer? _instance;
}

