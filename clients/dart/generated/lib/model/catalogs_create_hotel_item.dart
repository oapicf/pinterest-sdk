//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreateHotelItem {
  /// Returns a new [CatalogsCreateHotelItem] instance.
  CatalogsCreateHotelItem({
    required this.attributes,
    required this.hotelId,
    required this.operation,
  });

  CatalogsHotelAttributes attributes;

  /// The catalog hotel id in the merchant namespace
  String hotelId;

  CatalogsCreateHotelItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreateHotelItem &&
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
  String toString() => 'CatalogsCreateHotelItem[attributes=$attributes, hotelId=$hotelId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attributes'] = this.attributes;
      json[r'hotel_id'] = this.hotelId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsCreateHotelItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreateHotelItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attributes'), 'Required key "CatalogsCreateHotelItem[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "CatalogsCreateHotelItem[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'hotel_id'), 'Required key "CatalogsCreateHotelItem[hotel_id]" is missing from JSON.');
        assert(json[r'hotel_id'] != null, 'Required key "CatalogsCreateHotelItem[hotel_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsCreateHotelItem[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsCreateHotelItem[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreateHotelItem(
        attributes: CatalogsHotelAttributes.fromJson(json[r'attributes'])!,
        hotelId: mapValueOfType<String>(json, r'hotel_id')!,
        operation: CatalogsCreateHotelItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreateHotelItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateHotelItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateHotelItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreateHotelItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreateHotelItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreateHotelItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreateHotelItem-objects as value to a dart map
  static Map<String, List<CatalogsCreateHotelItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreateHotelItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreateHotelItem.listFromJson(entry.value, growable: growable,);
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


enum CatalogsCreateHotelItemOperationEnum {
  CREATE._(r'CREATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreateHotelItemOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreateHotelItemOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreateHotelItemOperationEnum? fromJson(dynamic value) => CatalogsCreateHotelItemOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreateHotelItemOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreateHotelItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreateHotelItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreateHotelItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreateHotelItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreateHotelItemOperationEnum].
class CatalogsCreateHotelItemOperationEnumTypeTransformer {
  factory CatalogsCreateHotelItemOperationEnumTypeTransformer() => _instance ??= const CatalogsCreateHotelItemOperationEnumTypeTransformer._();

  const CatalogsCreateHotelItemOperationEnumTypeTransformer._();

  String encode(CatalogsCreateHotelItemOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsCreateHotelItemOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreateHotelItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreateHotelItemOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATE': return CatalogsCreateHotelItemOperationEnum.CREATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreateHotelItemOperationEnumTypeTransformer? _instance;
}


