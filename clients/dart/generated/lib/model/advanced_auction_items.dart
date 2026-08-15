//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionItems {
  /// Returns a new [AdvancedAuctionItems] instance.
  AdvancedAuctionItems({
    this.catalogId,
    this.items = const [],
  });

  /// Response object of item bid options
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  /// Array with item bid options
  List<AdvancedAuctionItem> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionItems &&
    other.catalogId == catalogId &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (items.hashCode);

  @override
  String toString() => 'AdvancedAuctionItems[catalogId=$catalogId, items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [AdvancedAuctionItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdvancedAuctionItems[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdvancedAuctionItems[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdvancedAuctionItems(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        items: AdvancedAuctionItem.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<AdvancedAuctionItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionItems> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionItems-objects as value to a dart map
  static Map<String, List<AdvancedAuctionItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

