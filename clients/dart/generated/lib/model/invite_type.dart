//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
class InviteType {
  /// Instantiate a new enum with the provided [value].
  const InviteType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MEMBER_INVITE = InviteType._(r'MEMBER_INVITE');
  static const PARTNER_INVITE = InviteType._(r'PARTNER_INVITE');
  static const PARTNER_REQUEST = InviteType._(r'PARTNER_REQUEST');

  /// List of all possible values in this [enum][InviteType].
  static const values = <InviteType>[
    MEMBER_INVITE,
    PARTNER_INVITE,
    PARTNER_REQUEST,
  ];

  static InviteType? fromJson(dynamic value) => InviteTypeTypeTransformer().decode(value);

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

  String encode(InviteType data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [InviteTypeTypeTransformer] instance.
  static InviteTypeTypeTransformer? _instance;
}

