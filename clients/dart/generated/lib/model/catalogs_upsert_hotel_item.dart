//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpsertHotelItem {
  /// Returns a new [CatalogsUpsertHotelItem] instance.
  CatalogsUpsertHotelItem({
    required this.attributes,
    required this.hotelId,
    required this.operation,
  });

  CatalogsHotelAttributes attributes;

  /// The catalog hotel id in the merchant namespace
  String hotelId;

  CatalogsUpsertHotelItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpsertHotelItem &&
    other.attributes == attributes &&
    other.hotelId == hotelId &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes.hashCode) +
    (hotelId.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsUpsertHotelItem[attributes=$attributes, hotelId=$hotelId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'hotel_id'] = this.hotelId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsUpsertHotelItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpsertHotelItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsUpsertHotelItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsUpsertHotelItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsUpsertHotelItem(
        attributes: CatalogsHotelAttributes.fromJson(json[r'attributes'])!,
        hotelId: mapValueOfType<String>(json, r'hotel_id')!,
        operation: CatalogsUpsertHotelItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsUpsertHotelItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertHotelItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertHotelItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpsertHotelItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpsertHotelItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpsertHotelItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpsertHotelItem-objects as value to a dart map
  static Map<String, List<CatalogsUpsertHotelItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpsertHotelItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpsertHotelItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attributes',
    'hotel_id',
    'operation',
  };
}


class CatalogsUpsertHotelItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsUpsertHotelItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPSERT = CatalogsUpsertHotelItemOperationEnum._(r'UPSERT');

  /// List of all possible values in this [enum][CatalogsUpsertHotelItemOperationEnum].
  static const values = <CatalogsUpsertHotelItemOperationEnum>[
    UPSERT,
  ];

  static CatalogsUpsertHotelItemOperationEnum? fromJson(dynamic value) => CatalogsUpsertHotelItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsUpsertHotelItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpsertHotelItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpsertHotelItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsUpsertHotelItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsUpsertHotelItemOperationEnum].
class CatalogsUpsertHotelItemOperationEnumTypeTransformer {
  factory CatalogsUpsertHotelItemOperationEnumTypeTransformer() => _instance ??= const CatalogsUpsertHotelItemOperationEnumTypeTransformer._();

  const CatalogsUpsertHotelItemOperationEnumTypeTransformer._();

  String encode(CatalogsUpsertHotelItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsUpsertHotelItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsUpsertHotelItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPSERT': return CatalogsUpsertHotelItemOperationEnum.UPSERT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsUpsertHotelItemOperationEnumTypeTransformer] instance.
  static CatalogsUpsertHotelItemOperationEnumTypeTransformer? _instance;
}


