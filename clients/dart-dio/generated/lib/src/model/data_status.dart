//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'data_status.g.dart';

class DataStatus extends EnumClass {

  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const DataStatus PROCESSING = _$PROCESSING;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'READY')
  static const DataStatus READY = _$READY;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'ESTIMATE')
  static const DataStatus ESTIMATE = _$ESTIMATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_BUSINESS_CREATED')
  static const DataStatus BEFORE_BUSINESS_CREATED = _$BEFORE_BUSINESS_CREATED;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_DATA_RETENTION_PERIOD')
  static const DataStatus BEFORE_DATA_RETENTION_PERIOD = _$BEFORE_DATA_RETENTION_PERIOD;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_PIN_DATA_RETENTION_PERIOD')
  static const DataStatus BEFORE_PIN_DATA_RETENTION_PERIOD = _$BEFORE_PIN_DATA_RETENTION_PERIOD;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_METRIC_START_DATE')
  static const DataStatus BEFORE_METRIC_START_DATE = _$BEFORE_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_CORE_METRIC_START_DATE')
  static const DataStatus BEFORE_CORE_METRIC_START_DATE = _$BEFORE_CORE_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_PIN_FORMAT_METRIC_START_DATE')
  static const DataStatus BEFORE_PIN_FORMAT_METRIC_START_DATE = _$BEFORE_PIN_FORMAT_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_AUDIENCE_METRIC_START_DATE')
  static const DataStatus BEFORE_AUDIENCE_METRIC_START_DATE = _$BEFORE_AUDIENCE_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE')
  static const DataStatus BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE = _$BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_VIDEO_METRIC_START_DATE')
  static const DataStatus BEFORE_VIDEO_METRIC_START_DATE = _$BEFORE_VIDEO_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_CONVERSION_METRIC_START_DATE')
  static const DataStatus BEFORE_CONVERSION_METRIC_START_DATE = _$BEFORE_CONVERSION_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD')
  static const DataStatus PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD = _$PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'IN_BAD_TAG_DATE')
  static const DataStatus IN_BAD_TAG_DATE = _$IN_BAD_TAG_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_PUBLISHED_METRIC_START_DATE')
  static const DataStatus BEFORE_PUBLISHED_METRIC_START_DATE = _$BEFORE_PUBLISHED_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_ASSIST_METRIC_START_DATE')
  static const DataStatus BEFORE_ASSIST_METRIC_START_DATE = _$BEFORE_ASSIST_METRIC_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_PIN_CREATED')
  static const DataStatus BEFORE_PIN_CREATED = _$BEFORE_PIN_CREATED;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_ACCOUNT_CLAIMED')
  static const DataStatus BEFORE_ACCOUNT_CLAIMED = _$BEFORE_ACCOUNT_CLAIMED;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_DEMOGRAPHIC_FILTERS_START_DATE')
  static const DataStatus BEFORE_DEMOGRAPHIC_FILTERS_START_DATE = _$BEFORE_DEMOGRAPHIC_FILTERS_START_DATE;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD')
  static const DataStatus AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD = _$AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD')
  static const DataStatus AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD = _$AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD;
  /// Metrics availablity, e.g., \"READY\".
  @BuiltValueEnumConst(wireName: r'BEFORE_PRODUCT_GROUP_FILTER_START_DATE')
  static const DataStatus BEFORE_PRODUCT_GROUP_FILTER_START_DATE = _$BEFORE_PRODUCT_GROUP_FILTER_START_DATE;

  static Serializer<DataStatus> get serializer => _$dataStatusSerializer;

  const DataStatus._(String name): super(name);

  static BuiltSet<DataStatus> get values => _$values;
  static DataStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class DataStatusMixin = Object with _$DataStatusMixin;

