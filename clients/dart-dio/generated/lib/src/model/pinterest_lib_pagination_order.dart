//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinterest_lib_pagination_order.g.dart';

class PinterestLibPaginationOrder extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ASCENDING')
  static const PinterestLibPaginationOrder ASCENDING = _$ASCENDING;
  @BuiltValueEnumConst(wireName: r'DESCENDING')
  static const PinterestLibPaginationOrder DESCENDING = _$DESCENDING;

  static Serializer<PinterestLibPaginationOrder> get serializer => _$pinterestLibPaginationOrderSerializer;

  const PinterestLibPaginationOrder._(String name): super(name);

  static BuiltSet<PinterestLibPaginationOrder> get values => _$values;
  static PinterestLibPaginationOrder valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PinterestLibPaginationOrderMixin = Object with _$PinterestLibPaginationOrderMixin;

