//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkUpsertRequestUpdate {
  /// Returns a new [BulkUpsertRequestUpdate] instance.
  BulkUpsertRequestUpdate({
    this.adGroups = const [],
    this.ads = const [],
    this.campaigns = const [],
    this.catalogProductGroups = const [],
    this.keywords = const [],
    this.labels = const [],
    this.productGroups = const [],
  });

  List<AdGroupUpdateRequest> adGroups;

  List<AdUpdateRequest> ads;

  List<CampaignUpdateRequest> campaigns;

  List<CatalogsProductGroupsUpdateRequest> catalogProductGroups;

  List<KeywordUpdate> keywords;

  List<LabelBulkUpdateRequest> labels;

  List<ProductGroupPromotionUpdateRequest> productGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkUpsertRequestUpdate &&
    _deepEquality.equals(other.adGroups, adGroups) &&
    _deepEquality.equals(other.ads, ads) &&
    _deepEquality.equals(other.campaigns, campaigns) &&
    _deepEquality.equals(other.catalogProductGroups, catalogProductGroups) &&
    _deepEquality.equals(other.keywords, keywords) &&
    _deepEquality.equals(other.labels, labels) &&
    _deepEquality.equals(other.productGroups, productGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroups.hashCode) +
    (ads.hashCode) +
    (campaigns.hashCode) +
    (catalogProductGroups.hashCode) +
    (keywords.hashCode) +
    (labels.hashCode) +
    (productGroups.hashCode);

  @override
  String toString() => 'BulkUpsertRequestUpdate[adGroups=$adGroups, ads=$ads, campaigns=$campaigns, catalogProductGroups=$catalogProductGroups, keywords=$keywords, labels=$labels, productGroups=$productGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_groups'] = this.adGroups;
      json[r'ads'] = this.ads;
      json[r'campaigns'] = this.campaigns;
      json[r'catalog_product_groups'] = this.catalogProductGroups;
      json[r'keywords'] = this.keywords;
      json[r'labels'] = this.labels;
      json[r'product_groups'] = this.productGroups;
    return json;
  }

  /// Returns a new [BulkUpsertRequestUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkUpsertRequestUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BulkUpsertRequestUpdate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BulkUpsertRequestUpdate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BulkUpsertRequestUpdate(
        adGroups: AdGroupUpdateRequest.listFromJson(json[r'ad_groups']),
        ads: AdUpdateRequest.listFromJson(json[r'ads']),
        campaigns: CampaignUpdateRequest.listFromJson(json[r'campaigns']),
        catalogProductGroups: CatalogsProductGroupsUpdateRequest.listFromJson(json[r'catalog_product_groups']),
        keywords: KeywordUpdate.listFromJson(json[r'keywords']),
        labels: LabelBulkUpdateRequest.listFromJson(json[r'labels']),
        productGroups: ProductGroupPromotionUpdateRequest.listFromJson(json[r'product_groups']),
      );
    }
    return null;
  }

  static List<BulkUpsertRequestUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertRequestUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertRequestUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkUpsertRequestUpdate> mapFromJson(dynamic json) {
    final map = <String, BulkUpsertRequestUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkUpsertRequestUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkUpsertRequestUpdate-objects as value to a dart map
  static Map<String, List<BulkUpsertRequestUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkUpsertRequestUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkUpsertRequestUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

