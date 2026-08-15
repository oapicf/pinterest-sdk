//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudienceInsightType {
  /// Instantiate a new enum with the provided [value].
  const AudienceInsightType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const YOUR_TOTAL_AUDIENCE = AudienceInsightType._(r'YOUR_TOTAL_AUDIENCE');
  static const YOUR_ENGAGED_AUDIENCE = AudienceInsightType._(r'YOUR_ENGAGED_AUDIENCE');
  static const PINTEREST_TOTAL_AUDIENCE = AudienceInsightType._(r'PINTEREST_TOTAL_AUDIENCE');

  /// List of all possible values in this [enum][AudienceInsightType].
  static const values = <AudienceInsightType>[
    YOUR_TOTAL_AUDIENCE,
    YOUR_ENGAGED_AUDIENCE,
    PINTEREST_TOTAL_AUDIENCE,
  ];

  static AudienceInsightType? fromJson(dynamic value) => AudienceInsightTypeTypeTransformer().decode(value);

  static List<AudienceInsightType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceInsightType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceInsightType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceInsightType] to String,
/// and [decode] dynamic data back to [AudienceInsightType].
class AudienceInsightTypeTypeTransformer {
  factory AudienceInsightTypeTypeTransformer() => _instance ??= const AudienceInsightTypeTypeTransformer._();

  const AudienceInsightTypeTypeTransformer._();

  String encode(AudienceInsightType data) => data.value;

  /// Decodes a [dynamic value][data] to a AudienceInsightType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceInsightType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'YOUR_TOTAL_AUDIENCE': return AudienceInsightType.YOUR_TOTAL_AUDIENCE;
        case r'YOUR_ENGAGED_AUDIENCE': return AudienceInsightType.YOUR_ENGAGED_AUDIENCE;
        case r'PINTEREST_TOTAL_AUDIENCE': return AudienceInsightType.PINTEREST_TOTAL_AUDIENCE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AudienceInsightTypeTypeTransformer] instance.
  static AudienceInsightTypeTypeTransformer? _instance;
}

