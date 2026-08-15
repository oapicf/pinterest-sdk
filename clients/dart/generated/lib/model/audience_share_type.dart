//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudienceShareType {
  /// Instantiate a new enum with the provided [value].
  const AudienceShareType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHARED = AudienceShareType._(r'SHARED');
  static const RECEIVED = AudienceShareType._(r'RECEIVED');

  /// List of all possible values in this [enum][AudienceShareType].
  static const values = <AudienceShareType>[
    SHARED,
    RECEIVED,
  ];

  static AudienceShareType? fromJson(dynamic value) => AudienceShareTypeTypeTransformer().decode(value);

  static List<AudienceShareType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceShareType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceShareType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceShareType] to String,
/// and [decode] dynamic data back to [AudienceShareType].
class AudienceShareTypeTypeTransformer {
  factory AudienceShareTypeTypeTransformer() => _instance ??= const AudienceShareTypeTypeTransformer._();

  const AudienceShareTypeTypeTransformer._();

  String encode(AudienceShareType data) => data.value;

  /// Decodes a [dynamic value][data] to a AudienceShareType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceShareType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHARED': return AudienceShareType.SHARED;
        case r'RECEIVED': return AudienceShareType.RECEIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AudienceShareTypeTypeTransformer] instance.
  static AudienceShareTypeTypeTransformer? _instance;
}

