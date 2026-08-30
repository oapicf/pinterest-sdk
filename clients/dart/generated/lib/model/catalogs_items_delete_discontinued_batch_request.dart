//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsDeleteDiscontinuedBatchRequest {
  /// Returns a new [CatalogsItemsDeleteDiscontinuedBatchRequest] instance.
  CatalogsItemsDeleteDiscontinuedBatchRequest({
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with catalogs items
  List<ItemDeleteDiscontinuedBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsDeleteDiscontinuedBatchRequest &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsItemsDeleteDiscontinuedBatchRequest[country=$country, items=$items, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsItemsDeleteDiscontinuedBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsDeleteDiscontinuedBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsItemsDeleteDiscontinuedBatchRequest[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsDeleteDiscontinuedBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteDiscontinuedBatchRecord.listFromJson(json[r'items']),
        language: LanguageEnum.fromJson(json[r'language'])!,
        operation: CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsDeleteDiscontinuedBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsDeleteDiscontinuedBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsDeleteDiscontinuedBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsDeleteDiscontinuedBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsDeleteDiscontinuedBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsDeleteDiscontinuedBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsDeleteDiscontinuedBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsDeleteDiscontinuedBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsDeleteDiscontinuedBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsDeleteDiscontinuedBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'items',
    'language',
    'operation',
  };
}


enum CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum {
  DELETE_DISCONTINUED._(r'DELETE_DISCONTINUED'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum? fromJson(dynamic value) => CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum].
class CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer {
  factory CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer() => _instance ??= const CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer._();

  const CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer._();

  String encode(CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE_DISCONTINUED': return CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnum.DELETE_DISCONTINUED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsDeleteDiscontinuedBatchRequestOperationEnumTypeTransformer? _instance;
}


