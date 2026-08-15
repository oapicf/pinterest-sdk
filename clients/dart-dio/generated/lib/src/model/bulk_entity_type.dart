//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_entity_type.g.dart';

class BulkEntityType extends EnumClass {

  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const BulkEntityType CAMPAIGN = _$CAMPAIGN;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const BulkEntityType AD_GROUP = _$AD_GROUP;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'PRODUCT_GROUP')
  static const BulkEntityType PRODUCT_GROUP = _$PRODUCT_GROUP;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'AD')
  static const BulkEntityType AD = _$AD;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const BulkEntityType KEYWORD = _$KEYWORD;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'LABEL')
  static const BulkEntityType LABEL = _$LABEL;
  /// Refers ads entity type. Schedule enum is only applicable to beta users
  @BuiltValueEnumConst(wireName: r'SCHEDULE')
  static const BulkEntityType SCHEDULE = _$SCHEDULE;

  static Serializer<BulkEntityType> get serializer => _$bulkEntityTypeSerializer;

  const BulkEntityType._(String name): super(name);

  static BuiltSet<BulkEntityType> get values => _$values;
  static BulkEntityType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BulkEntityTypeMixin = Object with _$BulkEntityTypeMixin;

