//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductCategoryDetails {
  /// Returns a new [ProductCategoryDetails] instance.
  ProductCategoryDetails({
    this.demographics,
    required this.hasPrediction,
    this.metricsHighlights,
    this.predictedTimeSeries = const {},
    required this.productCategory,
    this.relatedSearches = const [],
    this.timeSeries = const {},
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProductCategoriesDemographic? demographics;

  ///      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
  bool hasPrediction;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProductCategoriesMetricsHighlights? metricsHighlights;

  ///      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
  Map<String, num> predictedTimeSeries;

  ProductCategoryEnum productCategory;

  /// Related search terms for this product category
  List<String> relatedSearches;

  /// Time series data showing trend values over time, indexed between 0 and 100
  Map<String, num> timeSeries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductCategoryDetails &&
    other.demographics == demographics &&
    other.hasPrediction == hasPrediction &&
    other.metricsHighlights == metricsHighlights &&
    _deepEquality.equals(other.predictedTimeSeries, predictedTimeSeries) &&
    other.productCategory == productCategory &&
    _deepEquality.equals(other.relatedSearches, relatedSearches) &&
    _deepEquality.equals(other.timeSeries, timeSeries);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (demographics == null ? 0 : demographics!.hashCode) +
    (hasPrediction.hashCode) +
    (metricsHighlights == null ? 0 : metricsHighlights!.hashCode) +
    (predictedTimeSeries.hashCode) +
    (productCategory.hashCode) +
    (relatedSearches.hashCode) +
    (timeSeries.hashCode);

  @override
  String toString() => 'ProductCategoryDetails[demographics=$demographics, hasPrediction=$hasPrediction, metricsHighlights=$metricsHighlights, predictedTimeSeries=$predictedTimeSeries, productCategory=$productCategory, relatedSearches=$relatedSearches, timeSeries=$timeSeries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.demographics != null) {
      json[r'demographics'] = this.demographics;
    } else {
      json[r'demographics'] = null;
    }
      json[r'has_prediction'] = this.hasPrediction;
    if (this.metricsHighlights != null) {
      json[r'metrics_highlights'] = this.metricsHighlights;
    } else {
      json[r'metrics_highlights'] = null;
    }
      json[r'predicted_time_series'] = this.predictedTimeSeries;
      json[r'product_category'] = this.productCategory;
      json[r'related_searches'] = this.relatedSearches;
      json[r'time_series'] = this.timeSeries;
    return json;
  }

  /// Returns a new [ProductCategoryDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductCategoryDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProductCategoryDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProductCategoryDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProductCategoryDetails(
        demographics: ProductCategoriesDemographic.fromJson(json[r'demographics']),
        hasPrediction: mapValueOfType<bool>(json, r'has_prediction')!,
        metricsHighlights: ProductCategoriesMetricsHighlights.fromJson(json[r'metrics_highlights']),
        predictedTimeSeries: mapCastOfType<String, num>(json, r'predicted_time_series') ?? const {},
        productCategory: ProductCategoryEnum.fromJson(json[r'product_category'])!,
        relatedSearches: json[r'related_searches'] is Iterable
            ? (json[r'related_searches'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        timeSeries: mapCastOfType<String, num>(json, r'time_series') ?? const {},
      );
    }
    return null;
  }

  static List<ProductCategoryDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductCategoryDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductCategoryDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductCategoryDetails> mapFromJson(dynamic json) {
    final map = <String, ProductCategoryDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductCategoryDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductCategoryDetails-objects as value to a dart map
  static Map<String, List<ProductCategoryDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductCategoryDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductCategoryDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'has_prediction',
    'product_category',
  };
}

