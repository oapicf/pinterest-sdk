//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AgeTrendsBucket {
  /// Instantiate a new enum with the provided [value].
  const AgeTrendsBucket._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const n1824 = AgeTrendsBucket._(r'18-24');
  static const n2534 = AgeTrendsBucket._(r'25-34');
  static const n3544 = AgeTrendsBucket._(r'35-44');
  static const n4549 = AgeTrendsBucket._(r'45-49');
  static const n5054 = AgeTrendsBucket._(r'50-54');
  static const n5564 = AgeTrendsBucket._(r'55-64');
  static const n65plus = AgeTrendsBucket._(r'65+');

  /// List of all possible values in this [enum][AgeTrendsBucket].
  static const values = <AgeTrendsBucket>[
    n1824,
    n2534,
    n3544,
    n4549,
    n5054,
    n5564,
    n65plus,
  ];

  static AgeTrendsBucket? fromJson(dynamic value) => AgeTrendsBucketTypeTransformer().decode(value);

  static List<AgeTrendsBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AgeTrendsBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AgeTrendsBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AgeTrendsBucket] to String,
/// and [decode] dynamic data back to [AgeTrendsBucket].
class AgeTrendsBucketTypeTransformer {
  factory AgeTrendsBucketTypeTransformer() => _instance ??= const AgeTrendsBucketTypeTransformer._();

  const AgeTrendsBucketTypeTransformer._();

  String encode(AgeTrendsBucket data) => data.value;

  /// Decodes a [dynamic value][data] to a AgeTrendsBucket.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AgeTrendsBucket? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'18-24': return AgeTrendsBucket.n1824;
        case r'25-34': return AgeTrendsBucket.n2534;
        case r'35-44': return AgeTrendsBucket.n3544;
        case r'45-49': return AgeTrendsBucket.n4549;
        case r'50-54': return AgeTrendsBucket.n5054;
        case r'55-64': return AgeTrendsBucket.n5564;
        case r'65+': return AgeTrendsBucket.n65plus;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AgeTrendsBucketTypeTransformer] instance.
  static AgeTrendsBucketTypeTransformer? _instance;
}

