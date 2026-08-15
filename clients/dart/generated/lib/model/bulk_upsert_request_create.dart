//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkUpsertRequestCreate {
  /// Returns a new [BulkUpsertRequestCreate] instance.
  BulkUpsertRequestCreate({
    this.adGroups = const [],
    this.ads = const [],
    this.campaigns = const [],
    this.catalogProductGroups = const [],
    this.keywords = const [],
    this.labels = const [],
    this.productGroups = const [],
  });

  List<AdGroupCreateRequest> adGroups;

  List<AdCreateRequest> ads;

  List<CampaignCreateRequest> campaigns;

  List<MultipleProductGroupsInner> catalogProductGroups;

  List<KeywordsRequest> keywords;

  List<LabelCreateRequest> labels;

  List<ProductGroupPromotionCreateRequest> productGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkUpsertRequestCreate &&
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
  String toString() => 'BulkUpsertRequestCreate[adGroups=$adGroups, ads=$ads, campaigns=$campaigns, catalogProductGroups=$catalogProductGroups, keywords=$keywords, labels=$labels, productGroups=$productGroups]';

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

  /// Returns a new [BulkUpsertRequestCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkUpsertRequestCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BulkUpsertRequestCreate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BulkUpsertRequestCreate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BulkUpsertRequestCreate(
        adGroups: AdGroupCreateRequest.listFromJson(json[r'ad_groups']),
        ads: AdCreateRequest.listFromJson(json[r'ads']),
        campaigns: CampaignCreateRequest.listFromJson(json[r'campaigns']),
        catalogProductGroups: MultipleProductGroupsInner.listFromJson(json[r'catalog_product_groups']),
        keywords: KeywordsRequest.listFromJson(json[r'keywords']),
        labels: LabelCreateRequest.listFromJson(json[r'labels']),
        productGroups: ProductGroupPromotionCreateRequest.listFromJson(json[r'product_groups']),
      );
    }
    return null;
  }

  static List<BulkUpsertRequestCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertRequestCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertRequestCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkUpsertRequestCreate> mapFromJson(dynamic json) {
    final map = <String, BulkUpsertRequestCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkUpsertRequestCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkUpsertRequestCreate-objects as value to a dart map
  static Map<String, List<BulkUpsertRequestCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkUpsertRequestCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkUpsertRequestCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

