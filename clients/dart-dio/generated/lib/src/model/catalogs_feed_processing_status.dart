//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_processing_status.g.dart';

class CatalogsFeedProcessingStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const CatalogsFeedProcessingStatus COMPLETED = _$COMPLETED;
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const CatalogsFeedProcessingStatus FAILED = _$FAILED;
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const CatalogsFeedProcessingStatus PROCESSING = _$PROCESSING;

  static Serializer<CatalogsFeedProcessingStatus> get serializer => _$catalogsFeedProcessingStatusSerializer;

  const CatalogsFeedProcessingStatus._(String name): super(name);

  static BuiltSet<CatalogsFeedProcessingStatus> get values => _$values;
  static CatalogsFeedProcessingStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsFeedProcessingStatusMixin = Object with _$CatalogsFeedProcessingStatusMixin;

