//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Entity status
class EntityStatus {
  /// Instantiate a new enum with the provided [value].
  const EntityStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = EntityStatus._(r'ACTIVE');
  static const PAUSED = EntityStatus._(r'PAUSED');
  static const ARCHIVED = EntityStatus._(r'ARCHIVED');
  static const DRAFT = EntityStatus._(r'DRAFT');
  static const DELETED_DRAFT = EntityStatus._(r'DELETED_DRAFT');

  /// List of all possible values in this [enum][EntityStatus].
  static const values = <EntityStatus>[
    ACTIVE,
    PAUSED,
    ARCHIVED,
    DRAFT,
    DELETED_DRAFT,
  ];

  static EntityStatus? fromJson(dynamic value) => EntityStatusTypeTransformer().decode(value);

  static List<EntityStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EntityStatus] to String,
/// and [decode] dynamic data back to [EntityStatus].
class EntityStatusTypeTransformer {
  factory EntityStatusTypeTransformer() => _instance ??= const EntityStatusTypeTransformer._();

  const EntityStatusTypeTransformer._();

  String encode(EntityStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a EntityStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EntityStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return EntityStatus.ACTIVE;
        case r'PAUSED': return EntityStatus.PAUSED;
        case r'ARCHIVED': return EntityStatus.ARCHIVED;
        case r'DRAFT': return EntityStatus.DRAFT;
        case r'DELETED_DRAFT': return EntityStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [EntityStatusTypeTransformer] instance.
  static EntityStatusTypeTransformer? _instance;
}

