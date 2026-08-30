//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvancedAuctionProcessedItems {
  /// Returns a new [AdvancedAuctionProcessedItems] instance.
  AdvancedAuctionProcessedItems({
    this.catalogId,
    this.items = const [],
  });

  /// Catalog id pertaining to all items
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  /// Array of advanced auction processed items
  List<AdvancedAuctionItemsSubmitRecord> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvancedAuctionProcessedItems &&
    other.catalogId == catalogId &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (items.hashCode);

  @override
  String toString() => 'AdvancedAuctionProcessedItems[catalogId=$catalogId, items=$items]';

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

  /// Returns a new [AdvancedAuctionProcessedItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvancedAuctionProcessedItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdvancedAuctionProcessedItems(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        items: AdvancedAuctionItemsSubmitRecord.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<AdvancedAuctionProcessedItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionProcessedItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionProcessedItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvancedAuctionProcessedItems> mapFromJson(dynamic json) {
    final map = <String, AdvancedAuctionProcessedItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvancedAuctionProcessedItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvancedAuctionProcessedItems-objects as value to a dart map
  static Map<String, List<AdvancedAuctionProcessedItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvancedAuctionProcessedItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvancedAuctionProcessedItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

