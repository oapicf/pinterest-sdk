//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ingestion_source.g.dart';

class IngestionSource extends EnumClass {

  @BuiltValueEnumConst(wireName: r'TAG')
  static const IngestionSource TAG = _$TAG;
  @BuiltValueEnumConst(wireName: r'MMP')
  static const IngestionSource MMP = _$MMP;
  @BuiltValueEnumConst(wireName: r'FILE_UPLOAD')
  static const IngestionSource FILE_UPLOAD = _$FILE_UPLOAD;
  @BuiltValueEnumConst(wireName: r'CONVERSIONS_API')
  static const IngestionSource CONVERSIONS_API = _$CONVERSIONS_API;
  @BuiltValueEnumConst(wireName: r'NATIVE')
  static const IngestionSource NATIVE = _$NATIVE;

  static Serializer<IngestionSource> get serializer => _$ingestionSourceSerializer;

  const IngestionSource._(String name): super(name);

  static BuiltSet<IngestionSource> get values => _$values;
  static IngestionSource valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class IngestionSourceMixin = Object with _$IngestionSourceMixin;

