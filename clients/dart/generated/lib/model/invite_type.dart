//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
enum InviteType {
  MEMBER_INVITE._(r'MEMBER_INVITE'),
  PARTNER_INVITE._(r'PARTNER_INVITE'),
  PARTNER_REQUEST._(r'PARTNER_REQUEST'),
  ;

  /// Instantiate a new enum with the provided value.
  const InviteType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [InviteType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static InviteType? fromJson(dynamic value) => InviteTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [InviteType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<InviteType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteType] to String,
/// and [decode] dynamic data back to [InviteType].
class InviteTypeTypeTransformer {
  factory InviteTypeTypeTransformer() => _instance ??= const InviteTypeTypeTransformer._();

  const InviteTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(InviteType data) => data._value;

  /// Returns the instance of [InviteType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteType? decode(dynamic data, {bool allowNull = true}) {
    if (data is InviteType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MEMBER_INVITE': return InviteType.MEMBER_INVITE;
        case r'PARTNER_INVITE': return InviteType.PARTNER_INVITE;
        case r'PARTNER_REQUEST': return InviteType.PARTNER_REQUEST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static InviteTypeTypeTransformer? _instance;
}

