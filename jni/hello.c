#include <jni.h>
jstring Java_com_example_hellojni_MainActivity_helloFromJNI(JNIEnv *env, jobject thiz)
{
	return (*env)->NewStringUTF(env, "hello this is my first jni project");
}
