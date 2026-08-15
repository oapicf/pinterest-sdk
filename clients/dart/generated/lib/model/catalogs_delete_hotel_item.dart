//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsDeleteHotelItem {
  /// Returns a new [CatalogsDeleteHotelItem] instance.
  CatalogsDeleteHotelItem({
    required this.hotelId,
    required this.operation,
  });

  /// The catalog hotel id in the merchant namespace
  String hotelId;

  CatalogsDeleteHotelItemOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsDeleteHotelItem &&
    other.hotelId == hotelId &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hotelId.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsDeleteHotelItem[hotelId=$hotelId, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'hotel_id'] = this.hotelId;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsDeleteHotelItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsDeleteHotelItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsDeleteHotelItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsDeleteHotelItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsDeleteHotelItem(
        hotelId: mapValueOfType<String>(json, r'hotel_id')!,
        operation: CatalogsDeleteHotelItemOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsDeleteHotelItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteHotelItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteHotelItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsDeleteHotelItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsDeleteHotelItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsDeleteHotelItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsDeleteHotelItem-objects as value to a dart map
  static Map<String, List<CatalogsDeleteHotelItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsDeleteHotelItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsDeleteHotelItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'hotel_id',
    'operation',
  };
}


class CatalogsDeleteHotelItemOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsDeleteHotelItemOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DELETE = CatalogsDeleteHotelItemOperationEnum._(r'DELETE');

  /// List of all possible values in this [enum][CatalogsDeleteHotelItemOperationEnum].
  static const values = <CatalogsDeleteHotelItemOperationEnum>[
    DELETE,
  ];

  static CatalogsDeleteHotelItemOperationEnum? fromJson(dynamic value) => CatalogsDeleteHotelItemOperationEnumTypeTransformer().decode(value);

  static List<CatalogsDeleteHotelItemOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDeleteHotelItemOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDeleteHotelItemOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsDeleteHotelItemOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsDeleteHotelItemOperationEnum].
class CatalogsDeleteHotelItemOperationEnumTypeTransformer {
  factory CatalogsDeleteHotelItemOperationEnumTypeTransformer() => _instance ??= const CatalogsDeleteHotelItemOperationEnumTypeTransformer._();

  const CatalogsDeleteHotelItemOperationEnumTypeTransformer._();

  String encode(CatalogsDeleteHotelItemOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsDeleteHotelItemOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsDeleteHotelItemOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsDeleteHotelItemOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsDeleteHotelItemOperationEnumTypeTransformer] instance.
  static CatalogsDeleteHotelItemOperationEnumTypeTransformer? _instance;
}


