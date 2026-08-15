//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsUpdateHotelItem {
  /// Returns a new [CatalogsUpdateHotelItem] instance.
  CatalogsUpdateHotelItem({
    required this.attributes,
    required this.hotelId,
    required this.operation,
  });

  CatalogsUpdatableHotelAttributes attributes;

  /// The catalog hotel item id in the merchant namespace
  String hotelId;

  CatalogsUpdateHotelItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsUpdateHotelItem &&
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
  String toString() => 'CatalogsUpdateHotelItem[attributes=$attributes, hotelId=$hotelId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'hotel_id'] = this.hotelId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsUpdateHotelItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsUpdateHotelItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsUpdateHotelItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsUpdateHotelItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsUpdateHotelItem(
        attributes: CatalogsUpdatableHotelAttributes.fromJson(json[r'attributes'])!,
        hotelId: mapValueOfType<String>(json, r'hotel_id')!,
        operation: CatalogsUpdateHotelItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsUpdateHotelItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpdateHotelItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpdateHotelItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsUpdateHotelItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsUpdateHotelItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsUpdateHotelItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsUpdateHotelItem-objects as value to a dart map
  static Map<String, List<CatalogsUpdateHotelItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsUpdateHotelItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsUpdateHotelItem.listFromJson(entry.value, growable: growable,);
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


class CatalogsUpdateHotelItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsUpdateHotelItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPDATE = CatalogsUpdateHotelItemOperationEnum._(r'UPDATE');

  /// List of all possible values in this [enum][CatalogsUpdateHotelItemOperationEnum].
  static const values = <CatalogsUpdateHotelItemOperationEnum>[
    UPDATE,
  ];

  static CatalogsUpdateHotelItemOperationEnum? fromJson(dynamic value) => CatalogsUpdateHotelItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsUpdateHotelItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsUpdateHotelItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsUpdateHotelItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsUpdateHotelItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsUpdateHotelItemOperationEnum].
class CatalogsUpdateHotelItemOperationEnumTypeTransformer {
  factory CatalogsUpdateHotelItemOperationEnumTypeTransformer() => _instance ??= const CatalogsUpdateHotelItemOperationEnumTypeTransformer._();

  const CatalogsUpdateHotelItemOperationEnumTypeTransformer._();

  String encode(CatalogsUpdateHotelItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsUpdateHotelItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsUpdateHotelItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPDATE': return CatalogsUpdateHotelItemOperationEnum.UPDATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsUpdateHotelItemOperationEnumTypeTransformer] instance.
  static CatalogsUpdateHotelItemOperationEnumTypeTransformer? _instance;
}


