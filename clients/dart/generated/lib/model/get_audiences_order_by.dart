//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class GetAudiencesOrderBy {
  /// Instantiate a new enum with the provided [value].
  const GetAudiencesOrderBy._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NONE = GetAudiencesOrderBy._(r'NONE');
  static const ID = GetAudiencesOrderBy._(r'ID');
  static const SIZE = GetAudiencesOrderBy._(r'SIZE');
  static const CREATION_DATE = GetAudiencesOrderBy._(r'CREATION_DATE');
  static const UPDATED_TIME = GetAudiencesOrderBy._(r'UPDATED_TIME');
  static const NAME = GetAudiencesOrderBy._(r'NAME');
  static const STATUS = GetAudiencesOrderBy._(r'STATUS');
  static const TYPE = GetAudiencesOrderBy._(r'TYPE');

  /// List of all possible values in this [enum][GetAudiencesOrderBy].
  static const values = <GetAudiencesOrderBy>[
    NONE,
    ID,
    SIZE,
    CREATION_DATE,
    UPDATED_TIME,
    NAME,
    STATUS,
    TYPE,
  ];

  static GetAudiencesOrderBy? fromJson(dynamic value) => GetAudiencesOrderByTypeTransformer().decode(value);

  static List<GetAudiencesOrderBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetAudiencesOrderBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetAudiencesOrderBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GetAudiencesOrderBy] to String,
/// and [decode] dynamic data back to [GetAudiencesOrderBy].
class GetAudiencesOrderByTypeTransformer {
  factory GetAudiencesOrderByTypeTransformer() => _instance ??= const GetAudiencesOrderByTypeTransformer._();

  const GetAudiencesOrderByTypeTransformer._();

  String encode(GetAudiencesOrderBy data) => data.value;

  /// Decodes a [dynamic value][data] to a GetAudiencesOrderBy.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GetAudiencesOrderBy? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NONE': return GetAudiencesOrderBy.NONE;
        case r'ID': return GetAudiencesOrderBy.ID;
        case r'SIZE': return GetAudiencesOrderBy.SIZE;
        case r'CREATION_DATE': return GetAudiencesOrderBy.CREATION_DATE;
        case r'UPDATED_TIME': return GetAudiencesOrderBy.UPDATED_TIME;
        case r'NAME': return GetAudiencesOrderBy.NAME;
        case r'STATUS': return GetAudiencesOrderBy.STATUS;
        case r'TYPE': return GetAudiencesOrderBy.TYPE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GetAudiencesOrderByTypeTransformer] instance.
  static GetAudiencesOrderByTypeTransformer? _instance;
}

