//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'query_label_entity_statuses_items.g.dart';

class QueryLabelEntityStatusesItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const QueryLabelEntityStatusesItems ACTIVE = _$ACTIVE;
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const QueryLabelEntityStatusesItems ARCHIVED = _$ARCHIVED;

  static Serializer<QueryLabelEntityStatusesItems> get serializer => _$queryLabelEntityStatusesItemsSerializer;

  const QueryLabelEntityStatusesItems._(String name): super(name);

  static BuiltSet<QueryLabelEntityStatusesItems> get values => _$values;
  static QueryLabelEntityStatusesItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class QueryLabelEntityStatusesItemsMixin = Object with _$QueryLabelEntityStatusesItemsMixin;

