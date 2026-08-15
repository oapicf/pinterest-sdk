//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Intended result of the campaign.  You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. 
class ObjectiveType {
  /// Instantiate a new enum with the provided [value].
  const ObjectiveType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AWARENESS = ObjectiveType._(r'AWARENESS');
  static const CONSIDERATION = ObjectiveType._(r'CONSIDERATION');
  static const WEB_CONVERSION = ObjectiveType._(r'WEB_CONVERSION');
  static const CATALOG_SALES = ObjectiveType._(r'CATALOG_SALES');
  static const VIDEO_COMPLETION = ObjectiveType._(r'VIDEO_COMPLETION');

  /// List of all possible values in this [enum][ObjectiveType].
  static const values = <ObjectiveType>[
    AWARENESS,
    CONSIDERATION,
    WEB_CONVERSION,
    CATALOG_SALES,
    VIDEO_COMPLETION,
  ];

  static ObjectiveType? fromJson(dynamic value) => ObjectiveTypeTypeTransformer().decode(value);

  static List<ObjectiveType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ObjectiveType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ObjectiveType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ObjectiveType] to String,
/// and [decode] dynamic data back to [ObjectiveType].
class ObjectiveTypeTypeTransformer {
  factory ObjectiveTypeTypeTransformer() => _instance ??= const ObjectiveTypeTypeTransformer._();

  const ObjectiveTypeTypeTransformer._();

  String encode(ObjectiveType data) => data.value;

  /// Decodes a [dynamic value][data] to a ObjectiveType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ObjectiveType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AWARENESS': return ObjectiveType.AWARENESS;
        case r'CONSIDERATION': return ObjectiveType.CONSIDERATION;
        case r'WEB_CONVERSION': return ObjectiveType.WEB_CONVERSION;
        case r'CATALOG_SALES': return ObjectiveType.CATALOG_SALES;
        case r'VIDEO_COMPLETION': return ObjectiveType.VIDEO_COMPLETION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ObjectiveTypeTypeTransformer] instance.
  static ObjectiveTypeTypeTransformer? _instance;
}

