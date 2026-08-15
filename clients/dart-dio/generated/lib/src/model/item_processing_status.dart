//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_processing_status.g.dart';

class ItemProcessingStatus extends EnumClass {

  /// The status of the item processing record
  @BuiltValueEnumConst(wireName: r'SUCCESS')
  static const ItemProcessingStatus SUCCESS = _$SUCCESS;
  /// The status of the item processing record
  @BuiltValueEnumConst(wireName: r'FAILURE')
  static const ItemProcessingStatus FAILURE = _$FAILURE;
  /// The status of the item processing record
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const ItemProcessingStatus PROCESSING = _$PROCESSING;

  static Serializer<ItemProcessingStatus> get serializer => _$itemProcessingStatusSerializer;

  const ItemProcessingStatus._(String name): super(name);

  static BuiltSet<ItemProcessingStatus> get values => _$values;
  static ItemProcessingStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ItemProcessingStatusMixin = Object with _$ItemProcessingStatusMixin;

