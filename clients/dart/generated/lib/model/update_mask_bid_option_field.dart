//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// bid option field to apply operation updates to
class UpdateMaskBidOptionField {
  /// Instantiate a new enum with the provided [value].
  const UpdateMaskBidOptionField._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BID = UpdateMaskBidOptionField._(r'BID');
  static const APP_TYPE_BID_MULTIPLIER_SET = UpdateMaskBidOptionField._(r'APP_TYPE_BID_MULTIPLIER_SET');
  static const PLACEMENT_BID_MULTIPLIER_SET = UpdateMaskBidOptionField._(r'PLACEMENT_BID_MULTIPLIER_SET');

  /// List of all possible values in this [enum][UpdateMaskBidOptionField].
  static const values = <UpdateMaskBidOptionField>[
    BID,
    APP_TYPE_BID_MULTIPLIER_SET,
    PLACEMENT_BID_MULTIPLIER_SET,
  ];

  static UpdateMaskBidOptionField? fromJson(dynamic value) => UpdateMaskBidOptionFieldTypeTransformer().decode(value);

  static List<UpdateMaskBidOptionField> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMaskBidOptionField>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMaskBidOptionField.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UpdateMaskBidOptionField] to String,
/// and [decode] dynamic data back to [UpdateMaskBidOptionField].
class UpdateMaskBidOptionFieldTypeTransformer {
  factory UpdateMaskBidOptionFieldTypeTransformer() => _instance ??= const UpdateMaskBidOptionFieldTypeTransformer._();

  const UpdateMaskBidOptionFieldTypeTransformer._();

  String encode(UpdateMaskBidOptionField data) => data.value;

  /// Decodes a [dynamic value][data] to a UpdateMaskBidOptionField.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UpdateMaskBidOptionField? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BID': return UpdateMaskBidOptionField.BID;
        case r'APP_TYPE_BID_MULTIPLIER_SET': return UpdateMaskBidOptionField.APP_TYPE_BID_MULTIPLIER_SET;
        case r'PLACEMENT_BID_MULTIPLIER_SET': return UpdateMaskBidOptionField.PLACEMENT_BID_MULTIPLIER_SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UpdateMaskBidOptionFieldTypeTransformer] instance.
  static UpdateMaskBidOptionFieldTypeTransformer? _instance;
}

