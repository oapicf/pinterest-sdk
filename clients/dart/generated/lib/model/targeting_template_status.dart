//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Indicate targeting template is active or Deleted
enum TargetingTemplateStatus {
  ACTIVE._(r'ACTIVE'),
  DELETED._(r'DELETED'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingTemplateStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingTemplateStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingTemplateStatus? fromJson(dynamic value) => TargetingTemplateStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingTemplateStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingTemplateStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingTemplateStatus] to String,
/// and [decode] dynamic data back to [TargetingTemplateStatus].
class TargetingTemplateStatusTypeTransformer {
  factory TargetingTemplateStatusTypeTransformer() => _instance ??= const TargetingTemplateStatusTypeTransformer._();

  const TargetingTemplateStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TargetingTemplateStatus data) => data._value;

  /// Returns the instance of [TargetingTemplateStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingTemplateStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingTemplateStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return TargetingTemplateStatus.ACTIVE;
        case r'DELETED': return TargetingTemplateStatus.DELETED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingTemplateStatusTypeTransformer? _instance;
}

