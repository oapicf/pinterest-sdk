//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The current status of the invite.
class InviteStatus {
  /// Instantiate a new enum with the provided [value].
  const InviteStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PENDING = InviteStatus._(r'PENDING');
  static const ACCEPTED = InviteStatus._(r'ACCEPTED');
  static const DECLINED = InviteStatus._(r'DECLINED');
  static const CANCELLED = InviteStatus._(r'CANCELLED');
  static const EXPIRED = InviteStatus._(r'EXPIRED');

  /// List of all possible values in this [enum][InviteStatus].
  static const values = <InviteStatus>[
    PENDING,
    ACCEPTED,
    DECLINED,
    CANCELLED,
    EXPIRED,
  ];

  static InviteStatus? fromJson(dynamic value) => InviteStatusTypeTransformer().decode(value);

  static List<InviteStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteStatus] to String,
/// and [decode] dynamic data back to [InviteStatus].
class InviteStatusTypeTransformer {
  factory InviteStatusTypeTransformer() => _instance ??= const InviteStatusTypeTransformer._();

  const InviteStatusTypeTransformer._();

  String encode(InviteStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PENDING': return InviteStatus.PENDING;
        case r'ACCEPTED': return InviteStatus.ACCEPTED;
        case r'DECLINED': return InviteStatus.DECLINED;
        case r'CANCELLED': return InviteStatus.CANCELLED;
        case r'EXPIRED': return InviteStatus.EXPIRED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteStatusTypeTransformer] instance.
  static InviteStatusTypeTransformer? _instance;
}

