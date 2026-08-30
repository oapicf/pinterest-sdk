//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'query_label_types_items.g.dart';

class QueryLabelTypesItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'BRAND')
  static const QueryLabelTypesItems BRAND = _$BRAND;
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const QueryLabelTypesItems CUSTOM = _$CUSTOM;

  static Serializer<QueryLabelTypesItems> get serializer => _$queryLabelTypesItemsSerializer;

  const QueryLabelTypesItems._(String name): super(name);

  static BuiltSet<QueryLabelTypesItems> get values => _$values;
  static QueryLabelTypesItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class QueryLabelTypesItemsMixin = Object with _$QueryLabelTypesItemsMixin;

