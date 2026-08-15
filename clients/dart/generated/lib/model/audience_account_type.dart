//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudienceAccountType {
  /// Instantiate a new enum with the provided [value].
  const AudienceAccountType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AD_ACCOUNT = AudienceAccountType._(r'AD_ACCOUNT');
  static const BUSINESS_ACCOUNT = AudienceAccountType._(r'BUSINESS_ACCOUNT');

  /// List of all possible values in this [enum][AudienceAccountType].
  static const values = <AudienceAccountType>[
    AD_ACCOUNT,
    BUSINESS_ACCOUNT,
  ];

  static AudienceAccountType? fromJson(dynamic value) => AudienceAccountTypeTypeTransformer().decode(value);

  static List<AudienceAccountType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceAccountType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceAccountType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceAccountType] to String,
/// and [decode] dynamic data back to [AudienceAccountType].
class AudienceAccountTypeTypeTransformer {
  factory AudienceAccountTypeTypeTransformer() => _instance ??= const AudienceAccountTypeTypeTransformer._();

  const AudienceAccountTypeTypeTransformer._();

  String encode(AudienceAccountType data) => data.value;

  /// Decodes a [dynamic value][data] to a AudienceAccountType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceAccountType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AD_ACCOUNT': return AudienceAccountType.AD_ACCOUNT;
        case r'BUSINESS_ACCOUNT': return AudienceAccountType.BUSINESS_ACCOUNT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AudienceAccountTypeTypeTransformer] instance.
  static AudienceAccountTypeTypeTransformer? _instance;
}

