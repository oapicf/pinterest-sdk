//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePartnerAssetAccessBodyAccessesInner {
  /// Returns a new [DeletePartnerAssetAccessBodyAccessesInner] instance.
  DeletePartnerAssetAccessBodyAccessesInner({
    required this.assetId,
    required this.partnerId,
    this.partnerType = const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum._('INTERNAL'),
  });

  /// Unique identifier of the business asset.
  String assetId;

  /// Unique identifier of a business partner to update asset access to.
  String partnerId;

  /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum partnerType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePartnerAssetAccessBodyAccessesInner &&
    other.assetId == assetId &&
    other.partnerId == partnerId &&
    other.partnerType == partnerType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId.hashCode) +
    (partnerId.hashCode) +
    (partnerType.hashCode);

  @override
  String toString() => 'DeletePartnerAssetAccessBodyAccessesInner[assetId=$assetId, partnerId=$partnerId, partnerType=$partnerType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id'] = this.assetId;
      json[r'partner_id'] = this.partnerId;
      json[r'partner_type'] = this.partnerType;
    return json;
  }

  /// Returns a new [DeletePartnerAssetAccessBodyAccessesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePartnerAssetAccessBodyAccessesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeletePartnerAssetAccessBodyAccessesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeletePartnerAssetAccessBodyAccessesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeletePartnerAssetAccessBodyAccessesInner(
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        partnerId: mapValueOfType<String>(json, r'partner_id')!,
        partnerType: DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.fromJson(json[r'partner_type']) ?? 'INTERNAL',
      );
    }
    return null;
  }

  static List<DeletePartnerAssetAccessBodyAccessesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessBodyAccessesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessBodyAccessesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePartnerAssetAccessBodyAccessesInner> mapFromJson(dynamic json) {
    final map = <String, DeletePartnerAssetAccessBodyAccessesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePartnerAssetAccessBodyAccessesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePartnerAssetAccessBodyAccessesInner-objects as value to a dart map
  static Map<String, List<DeletePartnerAssetAccessBodyAccessesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePartnerAssetAccessBodyAccessesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePartnerAssetAccessBodyAccessesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'partner_id',
  };
}

/// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
class DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const INTERNAL = DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum._(r'INTERNAL');
  static const EXTERNAL = DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum._(r'EXTERNAL');

  /// List of all possible values in this [enum][DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum].
  static const values = <DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum>[
    INTERNAL,
    EXTERNAL,
  ];

  static DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum? fromJson(dynamic value) => DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer().decode(value);

  static List<DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum] to String,
/// and [decode] dynamic data back to [DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum].
class DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer {
  factory DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer() => _instance ??= const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer._();

  const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer._();

  String encode(DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'INTERNAL': return DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.INTERNAL;
        case r'EXTERNAL': return DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.EXTERNAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer] instance.
  static DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumTypeTransformer? _instance;
}


