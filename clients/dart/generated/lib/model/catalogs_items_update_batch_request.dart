//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsUpdateBatchRequest {
  /// Returns a new [CatalogsItemsUpdateBatchRequest] instance.
  CatalogsItemsUpdateBatchRequest({
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with catalogs items
  List<ItemUpdateBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  CatalogsItemsUpdateBatchRequestOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsUpdateBatchRequest &&
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
  String toString() => 'CatalogsItemsUpdateBatchRequest[country=$country, items=$items, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsItemsUpdateBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsUpdateBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsUpdateBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsUpdateBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsItemsUpdateBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsItemsUpdateBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsUpdateBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsUpdateBatchRequest[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsItemsUpdateBatchRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsItemsUpdateBatchRequest[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsUpdateBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemUpdateBatchRecord.listFromJson(json[r'items']),
        language: LanguageEnum.fromJson(json[r'language'])!,
        operation: CatalogsItemsUpdateBatchRequestOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsUpdateBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsUpdateBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsUpdateBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsUpdateBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsUpdateBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsUpdateBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsUpdateBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsUpdateBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsUpdateBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsUpdateBatchRequest.listFromJson(entry.value, growable: growable,);
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


enum CatalogsItemsUpdateBatchRequestOperationEnum {
  UPDATE._(r'UPDATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsUpdateBatchRequestOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsUpdateBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsUpdateBatchRequestOperationEnum? fromJson(dynamic value) => CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsUpdateBatchRequestOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsUpdateBatchRequestOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsUpdateBatchRequestOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsUpdateBatchRequestOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsUpdateBatchRequestOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsUpdateBatchRequestOperationEnum].
class CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer {
  factory CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer() => _instance ??= const CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer._();

  const CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer._();

  String encode(CatalogsItemsUpdateBatchRequestOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsUpdateBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsUpdateBatchRequestOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsUpdateBatchRequestOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UPDATE': return CatalogsItemsUpdateBatchRequestOperationEnum.UPDATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsUpdateBatchRequestOperationEnumTypeTransformer? _instance;
}


