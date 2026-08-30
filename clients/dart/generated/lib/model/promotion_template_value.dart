//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PromotionTemplateValue {
  /// Returns a new [PromotionTemplateValue] instance.
  PromotionTemplateValue({
    this.amount,
    this.currencyCode,
    this.customText,
    this.percent,
  });

  /// Numeric value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? amount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currencyCode;

  /// Custom text.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customText;

  /// Percent value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? percent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PromotionTemplateValue &&
    other.amount == amount &&
    other.currencyCode == currencyCode &&
    other.customText == customText &&
    other.percent == percent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (amount == null ? 0 : amount!.hashCode) +
    (currencyCode == null ? 0 : currencyCode!.hashCode) +
    (customText == null ? 0 : customText!.hashCode) +
    (percent == null ? 0 : percent!.hashCode);

  @override
  String toString() => 'PromotionTemplateValue[amount=$amount, currencyCode=$currencyCode, customText=$customText, percent=$percent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.amount != null) {
      json[r'amount'] = this.amount;
    } else {
      json[r'amount'] = null;
    }
    if (this.currencyCode != null) {
      json[r'currency_code'] = this.currencyCode;
    } else {
      json[r'currency_code'] = null;
    }
    if (this.customText != null) {
      json[r'custom_text'] = this.customText;
    } else {
      json[r'custom_text'] = null;
    }
    if (this.percent != null) {
      json[r'percent'] = this.percent;
    } else {
      json[r'percent'] = null;
    }
    return json;
  }

  /// Returns a new [PromotionTemplateValue] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PromotionTemplateValue? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return PromotionTemplateValue(
        amount: num.parse('${json[r'amount']}'),
        currencyCode: Currency.fromJson(json[r'currency_code']),
        customText: mapValueOfType<String>(json, r'custom_text'),
        percent: num.parse('${json[r'percent']}'),
      );
    }
    return null;
  }

  static List<PromotionTemplateValue> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromotionTemplateValue>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromotionTemplateValue.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PromotionTemplateValue> mapFromJson(dynamic json) {
    final map = <String, PromotionTemplateValue>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PromotionTemplateValue.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PromotionTemplateValue-objects as value to a dart map
  static Map<String, List<PromotionTemplateValue>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PromotionTemplateValue>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PromotionTemplateValue.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

