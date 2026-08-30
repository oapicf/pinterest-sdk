//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingProductCategory {
  /// Returns a new [TrendingProductCategory] instance.
  TrendingProductCategory({
    required this.engagementType,
    required this.pctChangeMom,
    required this.percentRelativeVolume,
    required this.pinterestProductCategoryId,
    required this.productCategory,
    this.verticals = const [],
  });

  /// Engagement type
  ProductCategoriesEngagementType engagementType;

  /// Month-over-month change percentage
  int pctChangeMom;

  /// Relative volume percentage
  int percentRelativeVolume;

  /// Pinterest Product Category Id
  int pinterestProductCategoryId;

  /// Product Category Name
  String productCategory;

  /// Vertical name associated with the product category
  List<String> verticals;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingProductCategory &&
    other.engagementType == engagementType &&
    other.pctChangeMom == pctChangeMom &&
    other.percentRelativeVolume == percentRelativeVolume &&
    other.pinterestProductCategoryId == pinterestProductCategoryId &&
    other.productCategory == productCategory &&
    _deepEquality.equals(other.verticals, verticals);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (engagementType.hashCode) +
    (pctChangeMom.hashCode) +
    (percentRelativeVolume.hashCode) +
    (pinterestProductCategoryId.hashCode) +
    (productCategory.hashCode) +
    (verticals.hashCode);

  @override
  String toString() => 'TrendingProductCategory[engagementType=$engagementType, pctChangeMom=$pctChangeMom, percentRelativeVolume=$percentRelativeVolume, pinterestProductCategoryId=$pinterestProductCategoryId, productCategory=$productCategory, verticals=$verticals]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'engagement_type'] = this.engagementType;
      json[r'pct_change_mom'] = this.pctChangeMom;
      json[r'percent_relative_volume'] = this.percentRelativeVolume;
      json[r'pinterest_product_category_id'] = this.pinterestProductCategoryId;
      json[r'product_category'] = this.productCategory;
      json[r'verticals'] = this.verticals;
    return json;
  }

  /// Returns a new [TrendingProductCategory] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingProductCategory? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'engagement_type'), 'Required key "TrendingProductCategory[engagement_type]" is missing from JSON.');
        assert(json[r'engagement_type'] != null, 'Required key "TrendingProductCategory[engagement_type]" has a null value in JSON.');
        assert(json.containsKey(r'pct_change_mom'), 'Required key "TrendingProductCategory[pct_change_mom]" is missing from JSON.');
        assert(json[r'pct_change_mom'] != null, 'Required key "TrendingProductCategory[pct_change_mom]" has a null value in JSON.');
        assert(json.containsKey(r'percent_relative_volume'), 'Required key "TrendingProductCategory[percent_relative_volume]" is missing from JSON.');
        assert(json[r'percent_relative_volume'] != null, 'Required key "TrendingProductCategory[percent_relative_volume]" has a null value in JSON.');
        assert(json.containsKey(r'pinterest_product_category_id'), 'Required key "TrendingProductCategory[pinterest_product_category_id]" is missing from JSON.');
        assert(json[r'pinterest_product_category_id'] != null, 'Required key "TrendingProductCategory[pinterest_product_category_id]" has a null value in JSON.');
        assert(json.containsKey(r'product_category'), 'Required key "TrendingProductCategory[product_category]" is missing from JSON.');
        assert(json[r'product_category'] != null, 'Required key "TrendingProductCategory[product_category]" has a null value in JSON.');
        return true;
      }());

      return TrendingProductCategory(
        engagementType: ProductCategoriesEngagementType.fromJson(json[r'engagement_type'])!,
        pctChangeMom: mapValueOfType<int>(json, r'pct_change_mom')!,
        percentRelativeVolume: mapValueOfType<int>(json, r'percent_relative_volume')!,
        pinterestProductCategoryId: mapValueOfType<int>(json, r'pinterest_product_category_id')!,
        productCategory: mapValueOfType<String>(json, r'product_category')!,
        verticals: json[r'verticals'] is Iterable
            ? (json[r'verticals'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TrendingProductCategory> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingProductCategory>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingProductCategory.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingProductCategory> mapFromJson(dynamic json) {
    final map = <String, TrendingProductCategory>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingProductCategory.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingProductCategory-objects as value to a dart map
  static Map<String, List<TrendingProductCategory>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingProductCategory>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingProductCategory.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'engagement_type',
    'pct_change_mom',
    'percent_relative_volume',
    'pinterest_product_category_id',
    'product_category',
  };
}

