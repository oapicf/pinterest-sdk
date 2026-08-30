//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsDeleteBatchRequest {
  /// Returns a new [CatalogsItemsDeleteBatchRequest] instance.
  CatalogsItemsDeleteBatchRequest({
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with catalogs items
  List<ItemDeleteBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  CatalogsItemsDeleteBatchRequestOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsDeleteBatchRequest &&
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
  String toString() => 'CatalogsItemsDeleteBatchRequest[country=$country, items=$items, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsItemsDeleteBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsDeleteBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsDeleteBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsDeleteBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsItemsDeleteBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsItemsDeleteBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsDeleteBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsDeleteBatchRequest[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsItemsDeleteBatchRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsItemsDeleteBatchRequest[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsDeleteBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteBatchRecord.listFromJson(json[r'items']),
        language: LanguageEnum.fromJson(json[r'language'])!,
        operation: CatalogsItemsDeleteBatchRequestOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsDeleteBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsDeleteBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsDeleteBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsDeleteBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsDeleteBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsDeleteBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsDeleteBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsDeleteBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsDeleteBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsDeleteBatchRequest.listFromJson(entry.value, growable: growable,);
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


enum CatalogsItemsDeleteBatchRequestOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsDeleteBatchRequestOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsDeleteBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsDeleteBatchRequestOperationEnum? fromJson(dynamic value) => CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsDeleteBatchRequestOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsDeleteBatchRequestOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsDeleteBatchRequestOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsDeleteBatchRequestOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsDeleteBatchRequestOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsDeleteBatchRequestOperationEnum].
class CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer {
  factory CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer() => _instance ??= const CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer._();

  const CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer._();

  String encode(CatalogsItemsDeleteBatchRequestOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsDeleteBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsDeleteBatchRequestOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsDeleteBatchRequestOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsItemsDeleteBatchRequestOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsDeleteBatchRequestOperationEnumTypeTransformer? _instance;
}


