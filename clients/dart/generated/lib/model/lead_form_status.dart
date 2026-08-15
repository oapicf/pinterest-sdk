//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Status of the lead form
class LeadFormStatus {
  /// Instantiate a new enum with the provided [value].
  const LeadFormStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DRAFT = LeadFormStatus._(r'DRAFT');
  static const ACTIVE = LeadFormStatus._(r'ACTIVE');

  /// List of all possible values in this [enum][LeadFormStatus].
  static const values = <LeadFormStatus>[
    DRAFT,
    ACTIVE,
  ];

  static LeadFormStatus? fromJson(dynamic value) => LeadFormStatusTypeTransformer().decode(value);

  static List<LeadFormStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LeadFormStatus] to String,
/// and [decode] dynamic data back to [LeadFormStatus].
class LeadFormStatusTypeTransformer {
  factory LeadFormStatusTypeTransformer() => _instance ??= const LeadFormStatusTypeTransformer._();

  const LeadFormStatusTypeTransformer._();

  String encode(LeadFormStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a LeadFormStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LeadFormStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DRAFT': return LeadFormStatus.DRAFT;
        case r'ACTIVE': return LeadFormStatus.ACTIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LeadFormStatusTypeTransformer] instance.
  static LeadFormStatusTypeTransformer? _instance;
}

