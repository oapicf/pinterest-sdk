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
    required this.productCategory,
    this.verticals = const [],
  });

  /// Engagement type
  ProductCategoriesEngagementType engagementType;

  /// Month-over-month change percentage
  int pctChangeMom;

  /// Relative volume percentage
  int percentRelativeVolume;

  /// Product Category Name
  String productCategory;

  /// Vertical name associated with the product category
  List<VerticalProductCategory> verticals;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingProductCategory &&
    other.engagementType == engagementType &&
    other.pctChangeMom == pctChangeMom &&
    other.percentRelativeVolume == percentRelativeVolume &&
    other.productCategory == productCategory &&
    _deepEquality.equals(other.verticals, verticals);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (engagementType.hashCode) +
    (pctChangeMom.hashCode) +
    (percentRelativeVolume.hashCode) +
    (productCategory.hashCode) +
    (verticals.hashCode);

  @override
  String toString() => 'TrendingProductCategory[engagementType=$engagementType, pctChangeMom=$pctChangeMom, percentRelativeVolume=$percentRelativeVolume, productCategory=$productCategory, verticals=$verticals]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'engagement_type'] = this.engagementType;
      json[r'pct_change_mom'] = this.pctChangeMom;
      json[r'percent_relative_volume'] = this.percentRelativeVolume;
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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingProductCategory[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingProductCategory[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TrendingProductCategory(
        engagementType: ProductCategoriesEngagementType.fromJson(json[r'engagement_type'])!,
        pctChangeMom: mapValueOfType<int>(json, r'pct_change_mom')!,
        percentRelativeVolume: mapValueOfType<int>(json, r'percent_relative_volume')!,
        productCategory: mapValueOfType<String>(json, r'product_category')!,
        verticals: VerticalProductCategory.listFromJson(json[r'verticals']),
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
    'product_category',
  };
}

