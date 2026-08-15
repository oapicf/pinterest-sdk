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
class NonDraftEntityStatus {
  /// Instantiate a new enum with the provided [value].
  const NonDraftEntityStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = NonDraftEntityStatus._(r'ACTIVE');
  static const PAUSED = NonDraftEntityStatus._(r'PAUSED');
  static const ARCHIVED = NonDraftEntityStatus._(r'ARCHIVED');

  /// List of all possible values in this [enum][NonDraftEntityStatus].
  static const values = <NonDraftEntityStatus>[
    ACTIVE,
    PAUSED,
    ARCHIVED,
  ];

  static NonDraftEntityStatus? fromJson(dynamic value) => NonDraftEntityStatusTypeTransformer().decode(value);

  static List<NonDraftEntityStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NonDraftEntityStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NonDraftEntityStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NonDraftEntityStatus] to String,
/// and [decode] dynamic data back to [NonDraftEntityStatus].
class NonDraftEntityStatusTypeTransformer {
  factory NonDraftEntityStatusTypeTransformer() => _instance ??= const NonDraftEntityStatusTypeTransformer._();

  const NonDraftEntityStatusTypeTransformer._();

  String encode(NonDraftEntityStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a NonDraftEntityStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NonDraftEntityStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return NonDraftEntityStatus.ACTIVE;
        case r'PAUSED': return NonDraftEntityStatus.PAUSED;
        case r'ARCHIVED': return NonDraftEntityStatus.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [NonDraftEntityStatusTypeTransformer] instance.
  static NonDraftEntityStatusTypeTransformer? _instance;
}

