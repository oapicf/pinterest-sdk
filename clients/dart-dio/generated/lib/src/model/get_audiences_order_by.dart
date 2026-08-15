//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_audiences_order_by.g.dart';

class GetAudiencesOrderBy extends EnumClass {

  @BuiltValueEnumConst(wireName: r'NONE')
  static const GetAudiencesOrderBy NONE = _$NONE;
  @BuiltValueEnumConst(wireName: r'ID')
  static const GetAudiencesOrderBy ID = _$ID;
  @BuiltValueEnumConst(wireName: r'SIZE')
  static const GetAudiencesOrderBy SIZE = _$SIZE;
  @BuiltValueEnumConst(wireName: r'CREATION_DATE')
  static const GetAudiencesOrderBy CREATION_DATE = _$CREATION_DATE;
  @BuiltValueEnumConst(wireName: r'UPDATED_TIME')
  static const GetAudiencesOrderBy UPDATED_TIME = _$UPDATED_TIME;
  @BuiltValueEnumConst(wireName: r'NAME')
  static const GetAudiencesOrderBy NAME = _$NAME;
  @BuiltValueEnumConst(wireName: r'STATUS')
  static const GetAudiencesOrderBy STATUS = _$STATUS;
  @BuiltValueEnumConst(wireName: r'TYPE')
  static const GetAudiencesOrderBy TYPE = _$TYPE;

  static Serializer<GetAudiencesOrderBy> get serializer => _$getAudiencesOrderBySerializer;

  const GetAudiencesOrderBy._(String name): super(name);

  static BuiltSet<GetAudiencesOrderBy> get values => _$values;
  static GetAudiencesOrderBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class GetAudiencesOrderByMixin = Object with _$GetAudiencesOrderByMixin;

